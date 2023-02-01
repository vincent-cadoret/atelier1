package com.grp1.atelier1.model;

public class StoreOrder {
    int user_id;
    int card_id;
    public StoreOrder(int user_id, int card_id) {
        this.user_id = user_id;
        this.card_id = card_id;
    }
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public int getCard_id() {
        return card_id;
    }
    public void setCard_id(int card_id) {
        this.card_id = card_id;
    }
}
