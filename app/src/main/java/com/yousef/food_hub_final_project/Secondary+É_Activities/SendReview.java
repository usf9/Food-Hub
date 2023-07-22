package com.yousef.food_hub_final_project.Secondaryِ_Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.yousef.food_hub_final_project.R;

public class SendReview extends AppCompatActivity {

    TextView s1,s2,s3,s4,s5;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_review);
        s1=findViewById(R.id.star1);
        s2=findViewById(R.id.star2);
        s3=findViewById(R.id.star3);
        s4=findViewById(R.id.star4);
        s5=findViewById(R.id.star5);
        button=findViewById(R.id.btn);

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1.setText("⭐");
                s2.setText("-");
                s3.setText("-");
                s4.setText("-");
                s5.setText("-");
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1.setText("⭐");
                s2.setText("⭐");
                s3.setText("-");
                s4.setText("-");
                s5.setText("-");
            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1.setText("⭐");
                s2.setText("⭐");
                s3.setText("⭐");
                s4.setText("-");
                s5.setText("-");
            }
        });
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1.setText("⭐");
                s2.setText("⭐");
                s3.setText("⭐");
                s4.setText("⭐");
                s5.setText("-");
            }
        });
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1.setText("⭐");
                s2.setText("⭐");
                s3.setText("⭐");
                s4.setText("⭐");
                s5.setText("⭐");
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Toast.makeText(SendReview.this, "Thank you for commented us ...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}