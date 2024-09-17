package com.example.actividad9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1 = findViewById(R.id.imageView1);
        ImageView imageView2 = findViewById(R.id.imageView2);
        ImageView imageView3 = findViewById(R.id.imageView3);
        ImageView imageView4 = findViewById(R.id.imageView4);


        imageView1.setOnClickListener(v -> openSecondActivity(R.drawable.image1));
        imageView2.setOnClickListener(v -> openSecondActivity(R.drawable.image2));
        imageView3.setOnClickListener(v -> openSecondActivity(R.drawable.image3));
        imageView4.setOnClickListener(v -> openSecondActivity(R.drawable.image4));
    }

    private void openSecondActivity(int imageResourceId) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("imageResource", imageResourceId);
        startActivity(intent);
    }
}
