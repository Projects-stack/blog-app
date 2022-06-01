package com.yt.blog.controllers;

import com.yt.blog.payloads.ApiResponse;
import com.yt.blog.payloads.CommentDto;
import com.yt.blog.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/post/{postId}/comments")
    public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto commentDto,
                                                    @PathVariable Integer postId) {
        CommentDto comment = this.commentService.createComment(commentDto, postId);
        return new ResponseEntity<>(comment, HttpStatus.CREATED);
    }

    @DeleteMapping("/comments/{id}")
    public ResponseEntity<ApiResponse> deleteComment(@PathVariable Integer id) {
        this.commentService.deleteComment(id);
        return new ResponseEntity<>(new ApiResponse("Comment deleted successfully!!", true),
                HttpStatus.OK);
    }
}
