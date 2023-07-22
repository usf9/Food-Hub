package com.yousef.food_hub_final_project.Secondaryِ_Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.yousef.food_hub_final_project.R;

public class DeliveryActivity extends AppCompatActivity {
    CardView card1,card2;
    Button button;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);
        card1=findViewById(R.id.card1);
        button=findViewById(R.id.nxtbtn);
        back=findViewById(R.id.back_btn7);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DeliveryActivity.this, PaymentActivity.class);
                startActivity(i);
            }
        });
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DeliveryActivity.this, GetLocation.class);
                startActivity(i);
            }
        });
    }
}