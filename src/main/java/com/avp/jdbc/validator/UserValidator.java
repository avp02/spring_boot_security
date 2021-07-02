package com.avp.jdbc.validator;

import com.avp.jdbc.bean.User;
import org.springframework.stereotype.Service;

@Service
public class UserValidator {

    public static final int MIN_VALUE_LENGTH_PASS = 2;
    public static final int MIN_VALUE_LENGTH_USERNAME = 2;

    public static final String PASSWORD_ERORR = "password_valid";
    public static final String OK = "ok";
    public static final String USERNAME_ERORR = "username_valid";

    public String checkUser(User userForm){
        if(userForm.getUsername().length() < MIN_VALUE_LENGTH_USERNAME) {
            return USERNAME_ERORR;
        }
        if(userForm.getPassword().length() < MIN_VALUE_LENGTH_PASS) {
            return PASSWORD_ERORR;
        }
        return OK;
    }
}
