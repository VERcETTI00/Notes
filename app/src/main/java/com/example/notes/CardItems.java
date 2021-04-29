package com.example.notes;

import java.util.Date;

public class CardItems {
    private String xhead;
    private String xdate;

    public CardItems(String head, String date){
        xhead = head;
        xdate = date;
    }

    public String getHead(){
        return xhead;
    }

    public String getDate(){
        return xdate;
    }
}
