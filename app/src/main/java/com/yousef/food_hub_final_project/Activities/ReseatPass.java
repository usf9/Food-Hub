package com.yousef.food_hub_final_project.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.yousef.food_hub_final_project.R;

public class ReseatPass extends AppCompatActivity {

    EditText e1;
    Button btn , back;
    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reseat_pass);
        e1=findViewById(R.id.Reset_email);
        btn=findViewById(R.id.Send_new_password_btn);
        back=findViewById(R.id.back_btn);
        auth=FirebaseAuth.getInstance();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                auth.sendPasswordResetEmail(e1.getText().toString()).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(ReseatPass.this, "correct", Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            Toast.makeText(ReseatPass.this, "in correct", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ReseatPass.this,Login.class);
                startActivity(i);
            }
        });


    }
}