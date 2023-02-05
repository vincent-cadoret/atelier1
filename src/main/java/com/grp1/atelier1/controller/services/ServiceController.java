package com.grp1.atelier1.controller.services;

import org.springframework.ui.Model;
import com.grp1.atelier1.controller.CardDAO;
import com.grp1.atelier1.model.Card;
import com.grp1.atelier1.model.CardFormDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ServiceController {
    CardDAO cardDao = new CardDAO();
    @GetMapping("/search")
    public String getCardById(@RequestParam("id") int id, Model model) {
        Card card = cardDao.getCardById(id);
        model.addAttribute("card", card);
        return "card";

    }

    @GetMapping("/random")
    public String getRandomCard(Model model) {
        Card card = cardDao.getRandomCard();
        model.addAttribute("card", card);
        return "card";
    }

    @GetMapping("/list")
    public String getCardList(Model model) {
        List<Card> list = cardDao.getCardList();
        model.addAttribute("list", list);
        return "listCard";
    }


    @RequestMapping(value = { "/addCard"}, method = RequestMethod.POST)
    public String addcard(Model model, @ModelAttribute("cardForm") CardFormDTO cardForm) {
        Card p = cardDao.addCard(cardForm.getId(), cardForm.getName(), cardForm.getDescription(), cardForm.getFamily(), cardForm.getAffinity(), cardForm.getImgUrl(), cardForm.getSmallImageUrl(),
                cardForm.getEnergy(), cardForm.getHp(), cardForm.getDefence(), cardForm.getAttack(),
                cardForm.getPrice(), cardForm.getUserId());
        return "redirect:searchCard";
    }
}