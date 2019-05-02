package com.sreeluck.demo.service;

import java.util.List;

import com.sreeluck.demo.dto.UserDto;


/**
 * @author sxm147
 *
 */
public interface UserService {
    UserDto getUserById(Integer userId);
    void saveUser(UserDto userDto);
    List<UserDto> getAllUsers();
}
