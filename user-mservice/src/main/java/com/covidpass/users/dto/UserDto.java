package com.covidpass.users.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto implements Serializable {

    private String userId;

    private String firstName;

    private String lastName;

    private String password;

    private String email;

    private String encryptPassword;
}
