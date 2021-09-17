package com.example.mycalcilate_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Button simple=(Button) findViewById(R.id.simple);
         simple.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);

             }
         });

         Button science=(Button) findViewById(R.id.science);
         science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2_science.class);
                startActivity(intent);

            }
        });

         Button length=(Button) findViewById(R.id.length);
         length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,length.class);
                startActivity(intent);

            }
        });

         Button scale=(Button) findViewById(R.id.scale);
         scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,scale.class);
                startActivity(intent);

            }
        });

         Button volume=(Button) findViewById(R.id.volume);
         volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,volume.class);
                startActivity(intent);

            }
        });




    }
}