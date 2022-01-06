package com.covidpass.users.service;

import com.covidpass.users.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto dto);
}
