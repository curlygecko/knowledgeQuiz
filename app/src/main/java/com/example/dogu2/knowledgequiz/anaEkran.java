package com.example.dogu2.knowledgequiz;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class anaEkran extends Activity {

    TextView karsilama;
    Button cikiss, basla;
    Typeface fontt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_ekran);

        karsilama = findViewById(R.id.karsilama);
        basla = findViewById(R.id.basla);
        basla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent baslat = new Intent(anaEkran.this, MainActivity.class);
                startActivity(baslat);
            }
        });
    }
}
