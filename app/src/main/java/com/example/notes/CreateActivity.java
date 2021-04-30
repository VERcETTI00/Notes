package com.example.notes;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CreateActivity extends AppCompatActivity {

    ImageButton backButton;
    ImageButton next;

    EditText title;
    TextView date;
    EditText body;

    NoteElements noteElements;
    String mTitle;
    String mBody;
    String mDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        backButton = findViewById(R.id.back);
        next = findViewById(R.id.next);

        title = findViewById(R.id.titleOfTheNote);
        date = findViewById(R.id.date);
        body = findViewById(R.id.body);

//        mDate = noteElements.getDate();
//        date.setText(mDate);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTitle = title.getText().toString();
                mBody = body.getText().toString();
                noteElements = new NoteElements(mTitle,mBody);
                finish();
            }
        });

    }
}
