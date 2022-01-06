package com.covidpass.users.controller;

import com.covidpass.users.Entity.UserEntity;
import com.covidpass.users.dto.UserDto;
import com.covidpass.users.model.CreateUserRequestModel;
import com.covidpass.users.model.CreateUserResponse;
import com.covidpass.users.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController  {
    @Autowired
    Environment environment;

    @Autowired
    UserService userService;

    @GetMapping("status/test")
    public String test(){
        try {
            return String.valueOf(environment.getProperty("local.server.port"));
        }catch (Exception e) {
            return String.valueOf(e.getMessage());
        }
    }

    @PostMapping("")
    public ResponseEntity<CreateUserResponse> createUser(@RequestBody CreateUserRequestModel model){

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserDto dto = modelMapper.map(model, UserDto.class);
        UserDto userDtoResponse = userService.createUser(dto);
        CreateUserResponse response = modelMapper.map(userDtoResponse,CreateUserResponse.class);

        return new ResponseEntity<>(response,HttpStatus.CREATED);
    }
}
