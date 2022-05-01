package com.aaviles.cocktail.models.dto;

import com.aaviles.cocktail.models.User;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private Integer age;


    public static UserDto from(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
        userDto.setAge(user.getAge());
        return userDto;
    }

    //TODO: Add list of cocktails and interests after models are created to from method
    // refer to quote dto
}

