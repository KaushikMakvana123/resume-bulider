package com.demo.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ResumeBuildertActivity extends AppCompatActivity {
    ImageView ImgPlus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume_builder);
        initview();
    }

    private void initview() {
        ImgPlus = findViewById(R.id.ImgPlus);

        ImgPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ResumeBuildertActivity.this,LoginActivity.class);
                startActivity(i);
            }
        });
    }
}