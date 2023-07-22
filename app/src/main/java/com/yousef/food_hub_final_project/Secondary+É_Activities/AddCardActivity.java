package com.yousef.food_hub_final_project.Secondaryِ_Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.yousef.food_hub_final_project.Activities.Home_Screen;
import com.yousef.food_hub_final_project.R;

public class AddCardActivity extends AppCompatActivity {

    Button btn;
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);
        btn=findViewById(R.id.login_btn);
        back=findViewById(R.id.back_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AddCardActivity.this, "New Payment Card Is Added", Toast.LENGTH_SHORT).show();
                Intent i =new Intent(AddCardActivity.this, Home_Screen.class);
                startActivity(i);
            }
        });
    }
}