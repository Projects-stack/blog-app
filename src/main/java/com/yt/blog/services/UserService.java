package com.yt.blog.services;

import com.yt.blog.payloads.UserDto;

import java.util.List;

public interface UserService {

    UserDto registerNewUser(UserDto userDto);

    UserDto createUser(UserDto userDto);

    List<UserDto> getAllUsers();

    UserDto getUserById(Integer id);

    UserDto updateUser(UserDto userDto, Integer id);

    void deleteUser(Integer id);
}
