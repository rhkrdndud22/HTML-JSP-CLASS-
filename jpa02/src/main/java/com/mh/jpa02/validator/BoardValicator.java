package com.mh.jpa02.validator;


import com.mh.jpa02.controller.model.Board;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.thymeleaf.util.StringUtils;

@Component
public class BoardValicator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return Board.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Board board = (Board) o;
        if(StringUtils.isEmptyOrWhitespace(board.getContent())) {
            errors.rejectValue("content","key","내용을 입력하세요");
        }
    }
}
