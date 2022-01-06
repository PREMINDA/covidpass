package com.covidpass.users.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CreateUserResponse {
    private String userId;

    private String firstName;

    private String lastName;

    private String email;

}
