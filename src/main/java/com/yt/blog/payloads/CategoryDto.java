package com.yt.blog.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

    private Integer id;

    @NotBlank(message = "Title should not be blank")
    @Size(min = 4, message = "Title should contain at least 4 characters")
    private String title;

    @NotBlank(message = "Description should not be blank")
    @Size(min = 10, message = "Description should contain at least 10 characters")
    private String description;
}
