package com.mh.jpa02.controller;

import com.mh.jpa02.controller.model.Board;
import com.mh.jpa02.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
public class GreetingController {


    @Autowired
    BoardRepository boardRepository;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/")
    public String home() {

        return "home";
    }
    @GetMapping("/form")
    public String form(Board board) {

        return "/form";
    }
    @PostMapping("/form")
    public String form(@Valid Board board, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            /*System.out.println("일로오나");*/
            return "/form";
        }
        boardRepository.save(board);
        return "/form";
    }

    @GetMapping("/board")
    public String board(Model model) {
        /*List<Board> list = Arrays.asList(
                new Board(1l,"name","title","content","20210819"),
                new Board(2l,"board2","title2","content2","20220819"));*/
        List<Board> list = boardRepository.findAll();
        model.addAttribute( "list",list);
        return "board";
    }
}
