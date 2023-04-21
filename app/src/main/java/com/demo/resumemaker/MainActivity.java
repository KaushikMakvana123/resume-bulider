package com.demo.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
    }

    private void initview() {

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, ResumeBuildertActivity.class);
                startActivity(i);
                finish();
            }
        }, 5000);
    }
}


