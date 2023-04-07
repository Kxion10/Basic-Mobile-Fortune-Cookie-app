package com.example.fortunecookie2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowFortune(View view) {

        // make random num gen
        Random random = new Random();

        String[] Fortune = {"You will live a great life.", "You will live an OK life.", "You will live a decent life.","It could rain today?", "I have severe doubts about your future.","Go buy a lottery ticket, it will win something."};

        //Get a reference to the TextView on the UI
        TextView fortuneTextView = (TextView) findViewById(R.id.textView);

        int randomfortune = random.nextInt(Fortune.length);

        //Display the fortune
        fortuneTextView.setText(Fortune[randomfortune]);

    }//end method
}