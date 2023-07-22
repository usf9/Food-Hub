package com.yousef.food_hub_final_project.BrandsActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yousef.food_hub_final_project.Adapters.BigRecAdapter;
import com.yousef.food_hub_final_project.R;
import com.yousef.food_hub_final_project.Secondaryِ_Activities.SendReview;
import com.yousef.food_hub_final_project.model.BigRecModel;

import java.util.ArrayList;

public class MACActivity extends AppCompatActivity {

    TextView txt;
    ImageView back;
    RecyclerView bigRec;
    private ArrayList<BigRecModel> bigRecModelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_macactivity);
        bigRec =findViewById(R.id.rec1);
        txt=findViewById(R.id.textView11);
        back=findViewById(R.id.back_btn);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MACActivity.this, SendReview.class);
                startActivity(i);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        bigRecModelArrayList=new ArrayList<>();
        bigRecModelArrayList.add(new BigRecModel(R.drawable.b1,R.string.b1,R.string.free,R.string.time2,R.string.burger,R.string.fast,R.string.rate2,R.string.price1));
        bigRecModelArrayList.add(new BigRecModel(R.drawable.b2,R.string.b2,R.string.price7,R.string.time2,R.string.burger,R.string.fast,R.string.rate1,R.string.price2));
        bigRecModelArrayList.add(new BigRecModel(R.drawable.b3,R.string.b3,R.string.free,R.string.time2,R.string.burger,R.string.fast,R.string.rate4,R.string.price4));
        bigRecModelArrayList.add(new BigRecModel(R.drawable.b4,R.string.b1,R.string.price7,R.string.time3,R.string.burger,R.string.fast,R.string.rate3,R.string.price4));
        bigRecModelArrayList.add(new BigRecModel(R.drawable.mc_burger,R.string.mc1,R.string.price6,R.string.time3,R.string.chicken,R.string.fast,R.string.rate1,R.string.price5));
        bigRecModelArrayList.add(new BigRecModel(R.drawable.mc_chick,R.string.mc2,R.string.free,R.string.time2,R.string.burger,R.string.fast,R.string.rate1,R.string.price3));
        BigRecAdapter adapte =new BigRecAdapter(this,bigRecModelArrayList);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        bigRec.setLayoutManager(layoutManager);
        bigRec.setAdapter(adapte);
    }
}