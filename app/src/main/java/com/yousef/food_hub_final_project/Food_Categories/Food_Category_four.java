package com.yousef.food_hub_final_project.Food_Categories;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.yousef.food_hub_final_project.Adapters.BigRecAdapter;
import com.yousef.food_hub_final_project.R;
import com.yousef.food_hub_final_project.model.BigRecModel;

import java.util.ArrayList;

public class Food_Category_four extends AppCompatActivity {
    ImageView back;
    RecyclerView largeRec;
    private ArrayList<BigRecModel> bigRecModelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_category_four);
        largeRec =findViewById(R.id.rec);
        back=findViewById(R.id.back_btn5);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        bigRecModelArrayList=new ArrayList<>();
        bigRecModelArrayList.add(new BigRecModel(R.drawable.pizza_hut2,R.string.hut1,R.string.price7,R.string.time1,R.string.pizza,R.string.fast,R.string.rate2,R.string.price1));
        bigRecModelArrayList.add(new BigRecModel(R.drawable.pizza_hut1,R.string.hut2,R.string.price7,R.string.time1,R.string.pizza,R.string.fast,R.string.rate1,R.string.price2));
        bigRecModelArrayList.add(new BigRecModel(R.drawable.pizza77,R.string.hut3,R.string.price6,R.string.time1,R.string.pizza,R.string.fast,R.string.rate4,R.string.price4));
        bigRecModelArrayList.add(new BigRecModel(R.drawable.pizza_hut3,R.string.hut1,R.string.price6,R.string.time1,R.string.pizza,R.string.fast,R.string.rate3,R.string.price4));
        bigRecModelArrayList.add(new BigRecModel(R.drawable.pizza_hut4,R.string.hut2,R.string.price7,R.string.time1,R.string.pizza,R.string.fast,R.string.rate1,R.string.price5));
        bigRecModelArrayList.add(new BigRecModel(R.drawable.pizza77,R.string.hut3,R.string.price6,R.string.time1,R.string.pizza,R.string.fast,R.string.rate1,R.string.price3));
        BigRecAdapter adapte =new BigRecAdapter(this,bigRecModelArrayList);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        largeRec.setLayoutManager(layoutManager);
        largeRec.setAdapter(adapte);

    }
}