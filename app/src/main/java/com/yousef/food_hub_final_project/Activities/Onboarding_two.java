package com.yousef.food_hub_final_project.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yousef.food_hub_final_project.R;

public class Onboarding_two extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding_two);

        button = findViewById(R.id.next2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }

            private void openActivity2() {
                Intent intent = new Intent(Onboarding_two.this, Onboarding_three.class);
                startActivity(intent);
            }
        });
    }
}