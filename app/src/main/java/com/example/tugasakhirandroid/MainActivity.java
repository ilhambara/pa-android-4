package com.example.tugasakhirandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn_file,btn_image,btn_credit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_file = findViewById(R.id.btn_file);
        btn_image = findViewById(R.id.btn_image);
        btn_credit = findViewById(R.id.btn_credit);

        btn_file.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perintah Intent Explicit untuk berpindah ke UploadFile
                startActivity(new Intent(MainActivity.this, UploadFile.class));
            }
        });

        btn_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perintah Intent Explicit untuk berpindah ke UploadImage
                startActivity(new Intent(MainActivity.this, UploadImage.class));
            }
        });

        btn_credit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perintah Intent Explicit untuk berpindah ke CreditActivity
                startActivity(new Intent(MainActivity.this, CreditActivity.class));
            }
        });
    }
}
