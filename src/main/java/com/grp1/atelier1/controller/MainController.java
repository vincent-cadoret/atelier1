package com.grp1.atelier1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @RequestMapping(value = { "/search" }, method = RequestMethod.GET)
    public String searchCard() {
        return "searchCard";
    }
    @RequestMapping(value = { "/addCard" }, method = RequestMethod.GET)
    public String addCard() {
        return "formAddCard";
    }
    @RequestMapping(value = { "/addUser" }, method = RequestMethod.GET)
    public String addUser() {
        return "formAddUser";
    }
}
