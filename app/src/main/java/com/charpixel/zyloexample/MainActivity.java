package com.charpixel.zyloexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.charpixel.zylo.ZyloFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(com.charpixel.zylo.R.id.testButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ZyloFragment.showPopup(MainActivity.this,"This is for Testing",ZyloFragment.LENGTH_NORMAL,50);
            }
        });

    }
}
