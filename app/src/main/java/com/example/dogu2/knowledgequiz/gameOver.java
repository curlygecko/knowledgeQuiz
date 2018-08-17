package com.example.dogu2.knowledgequiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class gameOver extends AppCompatActivity {

    Button cik, playAgain;
    TextView gameOver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);



        cik = findViewById(R.id.cikis);
        playAgain = findViewById(R.id.playagain);
        gameOver = findViewById(R.id.over);

        Intent intent = getIntent();
        String mesaj = intent.getStringExtra("deneme");
        gameOver.setText("SKORUN\n"+mesaj);

        cik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(gameOver.this, anaEkran.class);
                startActivity(home);
            }
        });

        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(MainActivity.this, gameOver.class);
                Intent again = new Intent(gameOver.this, MainActivity.class);
                startActivity(again);
            }
        });

    }
}
