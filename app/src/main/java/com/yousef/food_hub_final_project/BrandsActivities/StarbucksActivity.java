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



public class StarbucksActivity extends AppCompatActivity {

    TextView txt;
    ImageView back;
    RecyclerView largeRec;
    private ArrayList<BigRecModel> largeRecModelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starbucks);
        largeRec =findViewById(R.id.rec1);
        back=findViewById(R.id.back_btn);
        txt=findViewById(R.id.textView10);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(StarbucksActivity.this, SendReview.class);
                startActivity(i);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        largeRecModelArrayList=new ArrayList<>();

        largeRecModelArrayList.add(new BigRecModel(R.drawable.americano,R.string.drink2,R.string.free,R.string.time1,R.string.drink,R.string.fast,R.string.rate2,R.string.price1));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.late,R.string.drink1,R.string.free,R.string.time1,R.string.drink,R.string.fast,R.string.rate1,R.string.price2));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.chocolate,R.string.drink2,R.string.free,R.string.time1,R.string.drink,R.string.fast,R.string.rate4,R.string.price4));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.capuccino,R.string.drink1,R.string.free,R.string.time1,R.string.drink,R.string.fast,R.string.rate3,R.string.price4));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.latte,R.string.drink2,R.string.free,R.string.time1,R.string.drink,R.string.fast,R.string.rate1,R.string.price5));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.chocolate,R.string.drink1,R.string.free,R.string.time1,R.string.drink,R.string.fast,R.string.rate1,R.string.price3));

        BigRecAdapter adapte =new BigRecAdapter(this,largeRecModelArrayList);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        largeRec.setLayoutManager(layoutManager);
        largeRec.setAdapter(adapte);
    }
}