package com.yt.blog.services;

import com.yt.blog.payloads.PostDto;
import com.yt.blog.payloads.PostResponse;

import java.util.List;

public interface PostService {

    PostDto getPostById(Integer id);

    PostResponse getAllPosts(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

    PostResponse getPostsByCategory(Integer categoryId, Integer pageNumber, Integer pageSize);

    PostResponse getPostsByUser(Integer userId, Integer pageNumber, Integer pageSize);

    PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

    PostDto updatePost(PostDto postDto, Integer id);

    void deletePost(Integer id);

    List<PostDto> searchPosts(String keyword);
}
