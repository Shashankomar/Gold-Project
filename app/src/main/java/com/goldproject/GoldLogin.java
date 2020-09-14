package com.goldproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class GoldLogin extends AppCompatActivity {
    private FloatingActionButton mFabLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gold_login);
        setRedirection();
    }

    private void setRedirection() {
        mFabLogin = findViewById(R.id.fab_login);
        mFabLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GoldLogin.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
