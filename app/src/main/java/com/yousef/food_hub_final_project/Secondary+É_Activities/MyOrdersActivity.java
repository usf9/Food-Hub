package com.yousef.food_hub_final_project.Secondaryِ_Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.yousef.food_hub_final_project.Activities.Home_Screen;
import com.yousef.food_hub_final_project.R;

public class MyOrdersActivity extends AppCompatActivity {

    ImageView btn;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_orders);
        button=findViewById(R.id.button);
        btn=findViewById(R.id.back_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MyOrdersActivity.this, Home_Screen.class);
                startActivity(i);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}