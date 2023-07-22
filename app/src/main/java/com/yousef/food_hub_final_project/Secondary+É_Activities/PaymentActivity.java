package com.yousef.food_hub_final_project.Secondaryِ_Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.yousef.food_hub_final_project.Activities.Home_Screen;
import com.yousef.food_hub_final_project.Activities.MainActivity;
import com.yousef.food_hub_final_project.R;

public class PaymentActivity extends AppCompatActivity {
    ImageView apple,pp,oo,changed,back,scan;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        apple=findViewById(R.id.imageView3 );
        scan=findViewById(R.id.scancode );

        oo=findViewById(R.id.imageView4 );
        pp=findViewById(R.id.imageView5 );
        changed=findViewById(R.id.scancode );
        button=findViewById(R.id.button);
        back=findViewById(R.id.imageView);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iee = new Intent(PaymentActivity.this, MainActivity.class);
                startActivity(iee);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ProgressDialog progressDialog = new ProgressDialog(PaymentActivity.this);
                progressDialog.setMessage("Loading..."); // Setting Message
                progressDialog.setTitle("Connecting Please Wait..."); // Setting Title
                progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER); // Progress Dialog Style Spinner
                progressDialog.show(); // Display Progress Dialog
                progressDialog.setCancelable(false);
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            Thread.sleep(10000);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        progressDialog.dismiss();
                    }
                }).start();
                Intent i =new Intent(PaymentActivity.this, Home_Screen.class);
                startActivity(i);
                Toast.makeText(PaymentActivity.this, "You Order is Confirmed Pleas Wait We Will Contact with you", Toast.LENGTH_SHORT).show();

            }
        });
        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changed.setImageResource(R.drawable.aa);
            }
        });
        oo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changed.setImageResource(R.drawable.oo);
            }
        });
        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changed.setImageResource(R.drawable.pp);
            }
        });
    }
}