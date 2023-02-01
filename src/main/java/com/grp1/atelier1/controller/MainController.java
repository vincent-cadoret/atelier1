package com.grp1.atelier1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;



@Controller
public class MainController {
    @RequestMapping(value = { "/", "/index", "search" }, method = RequestMethod.GET)
    public String searchCard() {
        return "searchCard";
    }
    @RequestMapping(value = { "/add" }, method = RequestMethod.GET)
    public String addCard() { return "form-sample"; }

    @Autowired
    CardDAO cardDAO;
    @RequestMapping(value = { "/view"}, method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("myCard",cardDAO.getRandomCard() );
        return "cardView";
    }
}
