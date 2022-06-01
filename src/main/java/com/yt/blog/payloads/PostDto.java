package com.yt.blog.payloads;

import com.yt.blog.entities.Comment;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
public class PostDto {

    private Integer id;

    @NotBlank(message = "Title should not be blank")
    private String title;

    @NotBlank(message = "Content should not be blank")
    private String content;

    @NotBlank(message = "Image name should not be blank")
    private String imageName;

    private Date lastModified;

    private CategoryDto category;

    private UserDto user;

    private Set<CommentDto> comments = new HashSet<>();

}
