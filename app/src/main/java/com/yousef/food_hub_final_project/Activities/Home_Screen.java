
package com.yousef.food_hub_final_project.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;
import com.yousef.food_hub_final_project.Adapters.LargeRecAdapter;
import com.yousef.food_hub_final_project.Adapters.SmallRecAdapter;
import com.yousef.food_hub_final_project.Food_Categories.Food_Category_five;
import com.yousef.food_hub_final_project.Food_Categories.Food_Category_four;
import com.yousef.food_hub_final_project.Food_Categories.Food_Category_one;
import com.yousef.food_hub_final_project.Food_Categories.Food_Category_three;
import com.yousef.food_hub_final_project.Food_Categories.Food_Category_two;
import com.yousef.food_hub_final_project.R;
import com.yousef.food_hub_final_project.Secondaryِ_Activities.ContactUsActivity;
import com.yousef.food_hub_final_project.Secondaryِ_Activities.DeliveryActivity;
import com.yousef.food_hub_final_project.Secondaryِ_Activities.HelpActivity;
import com.yousef.food_hub_final_project.Secondaryِ_Activities.MyOrdersActivity;
import com.yousef.food_hub_final_project.Secondaryِ_Activities.PaymentActivity;
import com.yousef.food_hub_final_project.Secondaryِ_Activities.ProfileActivity;
import com.yousef.food_hub_final_project.model.LargeRecModel;
import com.yousef.food_hub_final_project.model.SmallRecModel;

import java.util.ArrayList;

public class Home_Screen extends AppCompatActivity {

    ImageView burger,donut,hotdog,pizza,drinks,filter;
    public DrawerLayout drawerLayout;
    public NavigationView navigation_menu;
    int[] images = {R.drawable.meal1, R.drawable.meal2,R.drawable.memo};
    RecyclerView largeRec,smallRec,smallRec2,smallRec3,smallRec4;
    private ArrayList<LargeRecModel> largeRecModelArrayList;
    private ArrayList<SmallRecModel> smallRecModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        drawerLayout = findViewById(R.id.my_drawer_layout);
        navigation_menu =(NavigationView) findViewById(R.id.nav_view);
        largeRec = findViewById(R.id.large_rec1);
        smallRec = findViewById(R.id.small_rec);
        smallRec2 = findViewById(R.id.small_rec2);
        smallRec3 = findViewById(R.id.small_rec3);
        smallRec4 = findViewById(R.id.small_rec4);
        burger=findViewById(R.id.burger_icon);
        donut=findViewById(R.id.dounut_icon);
        hotdog=findViewById(R.id.hotdog_icon);
        pizza=findViewById(R.id.pizza_icon);
        drinks=findViewById(R.id.drink_icon);
        filter=findViewById(R.id.filter_icon);
        ////////////////////////////////////////////////////////////////////////////////////////////////
        burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home_Screen.this, Food_Category_one.class);
                startActivity(i);
            }

        });
        donut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home_Screen.this, Food_Category_two.class);
                startActivity(i);
            }

        });
        hotdog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home_Screen.this, Food_Category_three.class);
                startActivity(i);
            }

        });
        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home_Screen.this, Food_Category_four.class);
                startActivity(i);
            }

        });
        drinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home_Screen.this, Food_Category_five.class);
                startActivity(i);
            }

        });
        ////////////////////////////////////////////////////////////////////////////////////////////////


////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////



        navigation_menu.getMenu().getItem(0).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i =new Intent(Home_Screen.this, MyOrdersActivity.class);
                startActivity(i);
                return false;
            }
        });
        navigation_menu.getMenu().getItem(1).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i =new Intent(Home_Screen.this,ProfileActivity.class);
                startActivity(i);
                return false;
            }
        });
        navigation_menu.getMenu().getItem(2).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i =new Intent(Home_Screen.this, DeliveryActivity.class);
                startActivity(i);
                return false;
            }
        });
        navigation_menu.getMenu().getItem(3).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i =new Intent(Home_Screen.this, PaymentActivity.class);
                startActivity(i);
                return false;
            }
        });
        navigation_menu.getMenu().getItem(4).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i =new Intent(Home_Screen.this, ContactUsActivity.class);
                startActivity(i);
                return false;
            }
        });
        navigation_menu.getMenu().getItem(6).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i =new Intent(Home_Screen.this, HelpActivity.class);
                startActivity(i);
                return false;
            }
        });
        navigation_menu.getMenu().getItem(5).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i =new Intent(Home_Screen.this, ProfileActivity.class);
                startActivity(i);
                return false;
            }
        });
        navigation_menu.getMenu().getItem(7).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i =new Intent(Home_Screen.this,Welcome.class);
                startActivity(i);
                return false;
            }
        });
        ///////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////
        largeRecModelArrayList=new ArrayList<>();

        largeRecModelArrayList.add(new LargeRecModel(R.drawable.kintaki,R.string.kintaki_title,R.string.free,R.string.time3,R.string.chicken,R.string.burger,R.string.fast,R.string.rate2));
        largeRecModelArrayList.add(new LargeRecModel(R.drawable.mc_burger,R.string.mc_title,R.string.price6,R.string.time1,R.string.chicken,R.string.burger,R.string.fast,R.string.rate1));
        largeRecModelArrayList.add(new LargeRecModel(R.drawable.dominos,R.string.dominos_title,R.string.price7,R.string.time2,R.string.pizza,R.string.nulll,R.string.fast,R.string.rate4));
        largeRecModelArrayList.add(new LargeRecModel(R.drawable.pizza_hut2,R.string.hut_title,R.string.price7,R.string.time2,R.string.pizza,R.string.nulll,R.string.fast,R.string.rate3));
        largeRecModelArrayList.add(new LargeRecModel(R.drawable.late,R.string.star_title,R.string.free,R.string.time1,R.string.drink,R.string.nulll,R.string.fast,R.string.rate1));

////////////////////////////////////////////////////////////////////////////////////////////////////
        LargeRecAdapter adapte =new LargeRecAdapter(this,largeRecModelArrayList);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        largeRec.setLayoutManager(layoutManager);
        largeRec.setAdapter(adapte);
        ///////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////



        /////////////////////it work perfect////////////below this sent
        smallRecModelArrayList=new ArrayList<>();
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k1,R.string.kintaki_title,R.string.k1_des,R.string.price1,R.string.rate2));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k2,R.string.kintaki_title,R.string.k2_des,R.string.price2,R.string.rate3));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.mc_chick,R.string.mc_title,R.string.mc1,R.string.price4,R.string.rate4));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.latte,R.string.star_title,R.string.drink1,R.string.price5,R.string.rate3));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k5,R.string.kintaki_title,R.string.k2_des,R.string.price2,R.string.rate2));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.dominos,R.string.dominos_title,R.string.hut1,R.string.price3,R.string.rate1));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k1,R.string.kintaki_title,R.string.k1_des,R.string.price1,R.string.rate2));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k2,R.string.kintaki_title,R.string.k2_des,R.string.price2,R.string.rate3));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.mc_chick,R.string.mc_title,R.string.mc1,R.string.price4,R.string.rate4));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.latte,R.string.star_title,R.string.drink1,R.string.price5,R.string.rate3));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k5,R.string.kintaki_title,R.string.k2_des,R.string.price2,R.string.rate2));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.dominos,R.string.dominos_title,R.string.hut1,R.string.price3,R.string.rate1));
////////////////////////////////////////////////////////////////////////////////////////////////////
        SmallRecAdapter sadapte1 =new SmallRecAdapter(this,smallRecModelArrayList);
        LinearLayoutManager layoutManager1= new GridLayoutManager(this, 1, GridLayoutManager.HORIZONTAL, false);
        smallRec.setLayoutManager(layoutManager1);
        smallRec.setAdapter(sadapte1);


        //////////////////////
        smallRecModelArrayList=new ArrayList<>();
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k1,R.string.kintaki_title,R.string.k1_des,R.string.price1,R.string.rate2));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k2,R.string.kintaki_title,R.string.k2_des,R.string.price2,R.string.rate3));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.mc_chick,R.string.mc_title,R.string.mc1,R.string.price4,R.string.rate4));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.latte,R.string.star_title,R.string.drink1,R.string.price5,R.string.rate3));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k5,R.string.kintaki_title,R.string.k2_des,R.string.price2,R.string.rate2));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.dominos,R.string.dominos_title,R.string.hut1,R.string.price3,R.string.rate1));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k1,R.string.kintaki_title,R.string.k1_des,R.string.price1,R.string.rate2));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k2,R.string.kintaki_title,R.string.k2_des,R.string.price2,R.string.rate3));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.mc_chick,R.string.mc_title,R.string.mc1,R.string.price4,R.string.rate4));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.latte,R.string.star_title,R.string.drink1,R.string.price5,R.string.rate3));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k5,R.string.kintaki_title,R.string.k2_des,R.string.price2,R.string.rate2));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.dominos,R.string.dominos_title,R.string.hut1,R.string.price3,R.string.rate1));
////////////////////////////////////////////////////////////////////////////////////////////////////
        SmallRecAdapter sadapte2 =new SmallRecAdapter(this,smallRecModelArrayList);
        LinearLayoutManager layoutManager2= new GridLayoutManager(this, 1, RecyclerView.HORIZONTAL, false);
        smallRec3.setLayoutManager(layoutManager2);
        smallRec3.setAdapter(sadapte2);

        //////////////////////
        smallRecModelArrayList=new ArrayList<>();
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k1,R.string.kintaki_title,R.string.k1_des,R.string.price1,R.string.rate2));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k2,R.string.kintaki_title,R.string.k2_des,R.string.price2,R.string.rate3));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.mc_chick,R.string.mc_title,R.string.mc1,R.string.price4,R.string.rate4));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.latte,R.string.star_title,R.string.drink1,R.string.price5,R.string.rate3));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k5,R.string.kintaki_title,R.string.k2_des,R.string.price2,R.string.rate2));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.dominos,R.string.dominos_title,R.string.hut1,R.string.price3,R.string.rate1));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k1,R.string.kintaki_title,R.string.k1_des,R.string.price1,R.string.rate2));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k2,R.string.kintaki_title,R.string.k2_des,R.string.price2,R.string.rate3));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.mc_chick,R.string.mc_title,R.string.mc1,R.string.price4,R.string.rate4));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.latte,R.string.star_title,R.string.drink1,R.string.price5,R.string.rate3));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k5,R.string.kintaki_title,R.string.k2_des,R.string.price2,R.string.rate2));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.dominos,R.string.dominos_title,R.string.hut1,R.string.price3,R.string.rate1));
////////////////////////////////////////////////////////////////////////////////////////////////////
        SmallRecAdapter sadapte3 =new SmallRecAdapter(this,smallRecModelArrayList);
        LinearLayoutManager layoutManager3= new GridLayoutManager(this, 1, RecyclerView.HORIZONTAL, false);
        smallRec2.setLayoutManager(layoutManager3);
        smallRec2.setAdapter(sadapte3);
        //////////////////////
        smallRecModelArrayList=new ArrayList<>();
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k1,R.string.kintaki_title,R.string.k1_des,R.string.price1,R.string.rate2));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k2,R.string.kintaki_title,R.string.k2_des,R.string.price2,R.string.rate3));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.mc_chick,R.string.mc_title,R.string.mc1,R.string.price4,R.string.rate4));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.latte,R.string.star_title,R.string.drink1,R.string.price5,R.string.rate3));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k5,R.string.kintaki_title,R.string.k2_des,R.string.price2,R.string.rate2));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.dominos,R.string.dominos_title,R.string.hut1,R.string.price3,R.string.rate1));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k1,R.string.kintaki_title,R.string.k1_des,R.string.price1,R.string.rate2));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k2,R.string.kintaki_title,R.string.k2_des,R.string.price2,R.string.rate3));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.mc_chick,R.string.mc_title,R.string.mc1,R.string.price4,R.string.rate4));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.latte,R.string.star_title,R.string.drink1,R.string.price5,R.string.rate3));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k5,R.string.kintaki_title,R.string.k2_des,R.string.price2,R.string.rate2));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.dominos,R.string.dominos_title,R.string.hut1,R.string.price3,R.string.rate1));
////////////////////////////////////////////////////////////////////////////////////////////////////
        SmallRecAdapter sadapte4 =new SmallRecAdapter(this,smallRecModelArrayList);
        LinearLayoutManager layoutManager4= new GridLayoutManager(this, 1, RecyclerView.HORIZONTAL, false);
        smallRec4.setLayoutManager(layoutManager4);
        smallRec4.setAdapter(sadapte4);
    }
}