package com.example.dhananjay.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Random myRandomNumber = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        imageVar = findViewById(R.id.imageView);
//        imageVar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                rollOurDice();
//            }
//        });


    }

    public void rollDice(View view){

        ImageView imageVar;
        imageVar = findViewById(R.id.imageView);
        rollOurDice(imageVar);
        imageVar = findViewById(R.id.imageView2);
        rollOurDice(imageVar);

    }

    private void rollOurDice(ImageView imageVar){
        int no = myRandomNumber.nextInt(6) + 1;

        switch (no){
            case 1:
                imageVar.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageVar.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageVar.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageVar.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageVar.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageVar.setImageResource(R.drawable.dice6);

        }
    }
}
