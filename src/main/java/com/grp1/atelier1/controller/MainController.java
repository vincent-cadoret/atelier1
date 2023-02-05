package com.grp1.atelier1.controller;

import com.grp1.atelier1.model.Card;
import com.grp1.atelier1.model.CardFormDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class MainController {
    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String searchCard() {
        return "searchCard";
    }

    @RequestMapping(value = { "/add"}, method = RequestMethod.GET)
    public String add() {
        return "form-sample";
    }

}
