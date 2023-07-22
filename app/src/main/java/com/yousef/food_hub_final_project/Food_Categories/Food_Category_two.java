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

public class Food_Category_two extends AppCompatActivity {
    ImageView back;
    RecyclerView largeRec,largeRec2,largeRec3;
    private ArrayList<BigRecModel> largeRecModelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_category_two);

        largeRec =findViewById(R.id.drec1);
        largeRec2 =findViewById(R.id.drec2);
        largeRec3 =findViewById(R.id.drec3);
        back=findViewById(R.id.back_btn6);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ///////1st recyclerview
        largeRecModelArrayList=new ArrayList<>();

        largeRecModelArrayList.add(new BigRecModel(R.drawable.do1,R.string.d1,R.string.free,R.string.time1,R.string.d,R.string.fast,R.string.rate2,R.string.price1));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.do2,R.string.d2,R.string.free,R.string.time1,R.string.d,R.string.fast,R.string.rate1,R.string.price2));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.do3,R.string.d1,R.string.free,R.string.time1,R.string.d,R.string.fast,R.string.rate4,R.string.price4));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.do4,R.string.d2,R.string.free,R.string.time1,R.string.d,R.string.fast,R.string.rate3,R.string.price4));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.do5,R.string.d1,R.string.free,R.string.time1,R.string.d,R.string.fast,R.string.rate1,R.string.price5));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.do1,R.string.d2,R.string.free,R.string.time1,R.string.d,R.string.fast,R.string.rate1,R.string.price3));

        BigRecAdapter adapte =new BigRecAdapter(this,largeRecModelArrayList);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        largeRec.setLayoutManager(layoutManager);
        largeRec.setAdapter(adapte);



        ///////2nd recyclerview
        largeRecModelArrayList=new ArrayList<>();

        largeRecModelArrayList.add(new BigRecModel(R.drawable.do1,R.string.d1,R.string.free,R.string.time1,R.string.d,R.string.fast,R.string.rate2,R.string.price1));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.do2,R.string.d2,R.string.free,R.string.time1,R.string.d,R.string.fast,R.string.rate1,R.string.price2));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.do3,R.string.d1,R.string.free,R.string.time1,R.string.d,R.string.fast,R.string.rate4,R.string.price4));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.do4,R.string.d2,R.string.free,R.string.time1,R.string.d,R.string.fast,R.string.rate3,R.string.price4));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.do5,R.string.d1,R.string.free,R.string.time1,R.string.d,R.string.fast,R.string.rate1,R.string.price5));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.do1,R.string.d2,R.string.free,R.string.time1,R.string.d,R.string.fast,R.string.rate1,R.string.price3));

        BigRecAdapter adapte2 =new BigRecAdapter(this,largeRecModelArrayList);
        LinearLayoutManager layoutManager2= new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        largeRec2.setLayoutManager(layoutManager2);
        largeRec2.setAdapter(adapte2);


        ///////3th recyclerview
        largeRecModelArrayList=new ArrayList<>();

        largeRecModelArrayList.add(new BigRecModel(R.drawable.do1,R.string.d1,R.string.free,R.string.time1,R.string.d,R.string.fast,R.string.rate2,R.string.price1));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.do2,R.string.d2,R.string.free,R.string.time1,R.string.d,R.string.fast,R.string.rate1,R.string.price2));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.do3,R.string.d1,R.string.free,R.string.time1,R.string.d,R.string.fast,R.string.rate4,R.string.price4));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.do4,R.string.d2,R.string.free,R.string.time1,R.string.d,R.string.fast,R.string.rate3,R.string.price4));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.do5,R.string.d1,R.string.free,R.string.time1,R.string.d,R.string.fast,R.string.rate1,R.string.price5));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.do1,R.string.d2,R.string.free,R.string.time1,R.string.d,R.string.fast,R.string.rate1,R.string.price3));

        BigRecAdapter adapte3 =new BigRecAdapter(this,largeRecModelArrayList);
        LinearLayoutManager layoutManager3= new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        largeRec3.setLayoutManager(layoutManager3);
        largeRec3.setAdapter(adapte3);
    }
}