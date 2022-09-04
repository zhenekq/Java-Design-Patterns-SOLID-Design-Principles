package com.company.singleresp;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class UserController {

    private UserPersistenceService service = new UserPersistenceService();
    private UserMapper userMapper = new UserMapper();
    private UserValidator userValidator = new UserValidator();

    public String createUser(String userJson) throws IOException {
        User user = userMapper.mapToUser(userJson);
        boolean valid = userValidator.validateUserObject(user);
        if (!valid) {
            return "ERROR";
        }
        service.saveUser(user);
        return "SUCCESS";
    }
}