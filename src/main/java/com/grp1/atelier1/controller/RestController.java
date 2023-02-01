package com.grp1.atelier1.controller;

import com.grp1.atelier1.model.Card;
import com.grp1.atelier1.model.CardFormDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestController {
    @Autowired
    CardDAO cardDAO;
    @RequestMapping(value = { "/view"}, method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("myCard",cardDAO.getRandomCard() );
        return "cardView";
    }
    @RequestMapping(value = { "/addCard"}, method = RequestMethod.GET)
    public String addcard(Model model) {
        CardFormDTO cardForm = new CardFormDTO();
        model.addAttribute("cardForm", cardForm);
        return "cardForm";
    }

    @RequestMapping(value = { "/addCard"}, method = RequestMethod.POST)
    public String addcard(Model model, @ModelAttribute("cardForm") CardFormDTO cardForm) {
        Card p=cardDAO.addCard(cardForm.getId(), cardForm.getName(), cardForm.getDescription(), cardForm.getFamily(),             cardForm.getAffinity(), cardForm.getImgUrl(), cardForm.getSmallImageUrl(),
                cardForm.getEnergy(), cardForm.getHp(), cardForm.getDefence(), cardForm.getAttack(),
                cardForm.getPrice(), cardForm.getUserId());
        model.addAttribute("myCard",p );
        return "cardView";
    }

    @RequestMapping(value = { "/list"}, method = RequestMethod.GET)
    public String viewList(Model model) {
        model.addAttribute("cardList",cardDAO.getCardList());
        return "cardViewList";
    }

}
