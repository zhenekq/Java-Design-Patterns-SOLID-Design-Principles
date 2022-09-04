package com.company.singleresp;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class UserMapper {

    private ObjectMapper objectMapper = new ObjectMapper();

    public User mapToUser(String userObjectJson) throws IOException {
        return objectMapper.readValue(userObjectJson, User.class);
    }
}
