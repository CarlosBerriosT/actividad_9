package com.example.actividad9;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageView selectedImageView = findViewById(R.id.selectedImageView);
        Button buttonBack = findViewById(R.id.buttonBack);
        Button buttonExit = findViewById(R.id.buttonExit);


        int imageResource = getIntent().getIntExtra("imageResource", 0);
        selectedImageView.setImageResource(imageResource);


        buttonBack.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });


        buttonExit.setOnClickListener(v -> {
            finishAffinity();
        });
    }
}
