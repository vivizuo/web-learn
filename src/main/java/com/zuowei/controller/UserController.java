package com.zuowei.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ww on 2016/5/26.
 */
@Controller
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    /**
     * Get localhost:8080/vivi/login
     *
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginPage(@RequestParam(value = "username", required = false) String username,
                            @RequestParam(value = "password", required = false) String password) {
        logger.info("username: {}, password: {}", username, password);
        return "login";
    }

    /**
     * POST localhost:8080/vivi/login
     *
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String loginFunc(@RequestParam(value = "username") String username,
                            @RequestParam(value = "password") String password) {
        logger.info("username: {}, password: {}", username, password);
        if ("zuowei".equals(username) && "123123".equals(password)) {
            return "home";
        } else {
            return "login";
        }
    }

    @RequestMapping("signout")
    //localhost:8080/zuowei/signout
    public String signout(@RequestParam(value = "username") String username,
                          @RequestParam(value = "password") String password) {
        logger.info("username: {}, password: {}", username, password);
        if ("zuowei".equals(username) && "123123".equals(password)) {
            return "home";
        } else {
            return "login";
        }
    }


}
