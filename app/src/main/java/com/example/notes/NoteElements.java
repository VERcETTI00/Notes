package com.example.notes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class NoteElements {
    String title;
    String date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
    String body;

    public NoteElements(String mTitle, String mBody){
        title = mTitle;
        body = mBody;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getBody() {
        return body;
    }
}
