package com.covidpass.users.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CreateUserRequestModel {
    @NotNull(message = "firstname notnull")
    private String firstName;
    @NotNull(message = "lastname notnull")
    private String lastName;
    @NotNull(message = "password notnull")
    private String password;
    @NotNull(message = "email notnull")
    private String email;
}
