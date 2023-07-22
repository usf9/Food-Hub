package com.yousef.food_hub_final_project.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.yousef.food_hub_final_project.R;

public class Welcome extends AppCompatActivity {

    private Button button,si;
    TextView t99;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        t99 = findViewById(R.id.loginbtt);
        button = findViewById(R.id.skip);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }

            private void openActivity2() {
                Intent intent = new Intent(Welcome.this, Home_Screen.class);
                startActivity(intent);
            }
        });
        si = findViewById(R.id.sbtn);
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }

            private void openActivity3() {
                Intent intent = new Intent(Welcome.this, SignUp.class);
                startActivity(intent);
            }
        });
        t99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity33();
            }

            private void openActivity33() {
                Intent intent = new Intent(Welcome.this, Login.class);
                startActivity(intent);
            }
        });
    }
}