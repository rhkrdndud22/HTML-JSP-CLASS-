package com.mh.jpa02.controller;

import com.mh.jpa02.controller.model.Board;
import com.mh.jpa02.repository.BoardRepository;
import com.mh.jpa02.validator.BoardValicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;




@Controller
public class GreetingController {


    @Autowired
    BoardRepository boardRepository;

    @Autowired
    BoardValicator boardValicator;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/")
    public String home() {

        return "home";
    }
    @GetMapping("/view")
    public String view(Board board,Model model,long id) {
        board=boardRepository.findById(id).orElse(null);
        model.addAttribute("board",board);
        return "view";
    }
    @GetMapping("/form")
    public String form(Board board,Model model,@RequestParam(required = false,defaultValue = "0") long id) {
        if(id==0){
            return "form";
        }
        board=boardRepository.findById(id).orElse(null);
        model.addAttribute("board",board);
        return "form";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam(required = false,defaultValue = "0") long id) {
        boardRepository.deleteById(id);
        return "redirect:board";
    }
    @PostMapping("/form")
    public String form(Model model,@Valid Board board, BindingResult bindingResult) {
        model.addAttribute("board",board);
        boardValicator.validate(board,bindingResult);
        if(bindingResult.hasErrors()){
            /*System.out.println("일로오나");*/
            return "/form";
        }
        long nano = System.currentTimeMillis();
        String curDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(nano);
        board.setDate(curDate);
        /*board.setId((1l));*/

        boardRepository.save(board);
        return "redirect:board";
    }

    @GetMapping("/board")
    public String board(Model model,  @RequestParam(required = false,defaultValue = "0")int page,
                        @RequestParam(required = false,defaultValue = "")String searchtxt) {
        /*List<Board> list = Arrays.asList(
                new Board(1l,"name","title","content","20210819"),
                new Board(2l,"board2","title2","content2","20220819"));*/
        int size = 5;

        Page<Board> list = boardRepository.findByTitleContainingOrContentContaining(
                searchtxt,
                searchtxt,
                PageRequest.of(page,size,
                        Sort.by(Sort.Direction.DESC, "id")
                )
        );



        model.addAttribute("startpage",1);
        model.addAttribute("curpage",(list.getPageable().getPageNumber()+1));
        model.addAttribute("endpage",list.getTotalPages());

        model.addAttribute("list", list);
        return "board";
    }


}
