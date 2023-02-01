package com.grp1.atelier1.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.grp1.atelier1.model.Card;
import org.springframework.stereotype.Service;

@Service
public class CardDAO {
    private List<Card> myCardList;
    private Random randomGenerator;

    public CardDAO() {
        myCardList=new ArrayList<>();
        randomGenerator = new Random();
        createCardList();
    }

    private void createCardList() {

        Card c1=new Card(0, "Pikachu", "Pikachu description", "Pikachu family", "Pikachu affinity", "https://www.cartoonbucket.com/wp-content/uploads/2015/05/Laughing-Pikachu-Image.png", "https://www.pinclipart.com/picdir/big/373-3739172_pikachu-clipart-head-face-of-pikachu-png-download.png", 10, 10, 10, 10, 10, 0);
        Card c2=new Card(1, "Will Smith", "Will Smith description", "Smith family", "Smith affinity", "https://cdn-elle.ladmedia.fr/var/plain_site/storage/images/loisirs/series/will-smith-20-ans-apres-il-vieillit-exactement-comme-sa-serie-l-avait-predit-3512783/83285621-1-fre-FR/Will-Smith-20-ans-apres-il-vieillit-exactement-comme-sa-serie-l-avait-predit.jpg", "https://pngimg.com/uploads/face/face_PNG5645.png", 50, 50, 50, 50, 50, 0);

        myCardList.add(c1);
        myCardList.add(c2);
    }
    public List<Card> getPoneyList() {
        return this.myCardList;
    }
    public Card getCardById(int id){
        for (Card cardBean : myCardList) {
            if(cardBean.getId() == id){
                return cardBean;
            }
        }
        return null;
    }
    public Card getRandomCard(){
        int index=randomGenerator.nextInt(this.myCardList.size());
        return this.myCardList.get(index);
    }

    public Card addCard(int id, String name, String description, String family, String affinity, String imgUrl, String smallImageUrl, int energy, int hp, int defence, int attack, int price, int userId) {
        Card c = new Card(id, name, description, family, affinity, imgUrl, smallImageUrl, energy, hp, defence, attack, price, userId);
        this.myCardList.add(c);
        return c;
    }
}