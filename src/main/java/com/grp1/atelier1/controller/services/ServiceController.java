package com.grp1.atelier1.controller.services;

import ch.qos.logback.core.model.Model;
import com.grp1.atelier1.controller.CardDAO;
import com.grp1.atelier1.model.Card;
import com.grp1.atelier1.model.CardFormDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServiceController {
    CardDAO cardDao = new CardDAO();
    @GetMapping("/search?{id}")
    public Card getCardbyId(@PathVariable("id") int id) {
        return cardDao.getCardById(id);
    }

    @GetMapping("/card/random")
    public Card getRandomCard() {
        return cardDao.getRandomCard();
    }

    @GetMapping("/card/list")
    public List<Card> getCardList() {
        return cardDao.getCardList();
    }

    @RequestMapping(value = { "/addCard"}, method = RequestMethod.POST)
    public String addcard(Model model, @ModelAttribute("cardForm") CardFormDTO cardForm) {
        Card p = cardDao.addCard(cardForm.getId(), cardForm.getName(), cardForm.getDescription(), cardForm.getFamily(), cardForm.getAffinity(), cardForm.getImgUrl(), cardForm.getSmallImageUrl(),
                cardForm.getEnergy(), cardForm.getHp(), cardForm.getDefence(), cardForm.getAttack(),
                cardForm.getPrice(), cardForm.getUserId());
        //model.addAttribute("myCard", p);
        return "/card/random";
    }
}