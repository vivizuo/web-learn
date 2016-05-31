package com.vivi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    /**
     * Get localhost:8080/vivi/login
     */
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    /**
     * POST localhost:8080/vivi/login
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String loginFunc(@RequestParam(value = "username") String username,
                            @RequestParam(value = "password") String password) {
        logger.info("username: {}, password: {}", username, password);
        if ("test".equals(username) && "123".equals(password)) {
            return "home";
        } else {
            return "login";
        }
    }

    @RequestMapping("signout")
    public String signout(@RequestParam(value = "username") String username,
                          @RequestParam(value = "password") String password) {
        return "login";
    }


}
