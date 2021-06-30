package com.example.happy_new_year;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    private CardView news1Card, news2Card, news3Card, news4Card, news5Card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        news1Card = (CardView) findViewById(R.id.card_1);
        news2Card = (CardView) findViewById(R.id.card_2);
        news3Card = (CardView) findViewById(R.id.card_3);
        news4Card = (CardView) findViewById(R.id.card_4);
        news5Card = (CardView) findViewById(R.id.card_5);

        news1Card.setOnClickListener(this);
        news2Card.setOnClickListener(this);
        news3Card.setOnClickListener(this);
        news4Card.setOnClickListener(this);
        news5Card.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId()){
            case (R.id.card_1):
                i = new Intent(this, MainActivity1.class);
                startActivity(i);
                break;
            case (R.id.card_2):
                i = new Intent(this, MainActivity2.class);
                startActivity(i);
                break;
            case (R.id.card_3):
                i = new Intent(this, MainActivity3.class);
                startActivity(i);
                break;
            case (R.id.card_4):
                i = new Intent(this, MainActivity4.class);
                startActivity(i);
                break;
            case (R.id.card_5):
                i = new Intent(this, MainActivity5.class);
                startActivity(i);
                break;
            default: break;
        }
    }
}