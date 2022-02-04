package com.koreait.springbootboard.board.comment;

import com.koreait.springbootboard.ResultVo;
import com.koreait.springbootboard.board.comment.model.BoardCommentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ajax/comment")
public class CommentRestController {
    @Autowired private CommentService service;

    @PostMapping
    public ResultVo insComment(@RequestBody BoardCommentEntity entity){
        System.out.println(entity);
        return null;
    }
}