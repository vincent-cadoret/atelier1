package com.grp1.atelier1.model;

public class StoreTransaction {
    int id;
    int userId;
    int cardId;
    String action;
    String timeSt;

    public StoreTransaction(int id, int userId, int cardId, String action, String timeSt) {
        this.id = id;
        this.userId = userId;
        this.cardId = cardId;
        this.action = action;
        this.timeSt = timeSt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getTimeSt() {
        return timeSt;
    }

    public void setTimeSt(String timeSt) {
        this.timeSt = timeSt;
    }
}
