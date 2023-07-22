package com.yousef.food_hub_final_project.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.yousef.food_hub_final_project.Activities.Home_Screen;
import com.yousef.food_hub_final_project.BrandsActivities.DominosActivity;
import com.yousef.food_hub_final_project.BrandsActivities.KFCActivity;
import com.yousef.food_hub_final_project.BrandsActivities.MACActivity;
import com.yousef.food_hub_final_project.BrandsActivities.PizzaHutActivity;
import com.yousef.food_hub_final_project.BrandsActivities.StarbucksActivity;
import com.yousef.food_hub_final_project.R;
import com.yousef.food_hub_final_project.model.LargeRecModel;

import java.util.ArrayList;

public class LargeRecAdapter extends RecyclerView.Adapter<LargeRecAdapter.Viewholder> {
    private Context context;
    private ArrayList<LargeRecModel> largeRecArrayList;
    int[] type;

    public LargeRecAdapter(Context context, ArrayList<LargeRecModel> largeRecArrayList) {
        this.context = context;
        this.largeRecArrayList = largeRecArrayList;

    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.large_rec,parent,false);

        return new Viewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        LargeRecModel largeRecModel = largeRecArrayList.get(position);
        holder.item_image.setImageResource(largeRecModel.getItem_image());
        holder.item_name.setText(largeRecModel.getItem_name());
        holder.item_del.setText(largeRecModel.getItem_del());
        holder.item_del_time.setText(largeRecModel.getItem_del_time());
        holder.item_type1.setText(largeRecModel.getItem_type1());
        holder.item_type2.setText(largeRecModel.getItem_type2());
        holder.item_type3.setText(largeRecModel.getItem_type3());
        holder.item_rate.setText(largeRecModel.getItem_rate());
        switch (position) {
            case 0:
                holder.itemView.setOnClickListener(v -> {
                    Intent intent = new Intent(context, KFCActivity.class);
                    context.startActivity(intent);
                });
                break;

            case 1:
                holder.itemView.setOnClickListener(v -> {
                    Intent intent = new Intent(context, MACActivity.class);
                    context.startActivity(intent);
                });
                break;

            case 2:
                holder.itemView.setOnClickListener(v -> {
                    Intent intent = new Intent(context, DominosActivity.class);
                    context.startActivity(intent);
                });
                break;
            case 3:
                holder.itemView.setOnClickListener(v -> {
                    Intent intent = new Intent(context, PizzaHutActivity.class);
                    context.startActivity(intent);
                });
                break;
            case 4:
                holder.itemView.setOnClickListener(v -> {
                    Intent intent = new Intent(context, StarbucksActivity.class);
                    context.startActivity(intent);
                });
                break;
            default:
                holder.itemView.setOnClickListener(v -> {
                    Intent intent = new Intent(context, Home_Screen.class);
                    context.startActivity(intent);
                });
        }

    }

    @Override
    public int getItemCount() {
        return  largeRecArrayList.size();
    }
    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView item_image;
        private TextView item_name,item_del,item_del_time,item_type1,item_type2,item_type3,item_rate;

    public Viewholder(@NonNull View itemView) {
        super(itemView);
        item_image = itemView.findViewById(R.id.item_img);
        item_name=itemView.findViewById(R.id.item_title);
        item_del=itemView.findViewById(R.id.delivery_price);
        item_del_time=itemView.findViewById(R.id.delivery_time);
        item_type1 = itemView.findViewById(R.id.chip1);
        item_type2 = itemView.findViewById(R.id.chip2);
        item_type3 = itemView.findViewById(R.id.chip3);
        item_rate = itemView.findViewById(R.id.item_rate);



    }
}}

//    public LargeRecAdapter(Context context,ArrayList<LargeRecModel> longRecArrayList){
//        this.context=context;
//        this.longRecArrayList=longRecArrayList;
//
//    }
//    @NonNull
//
//    public LargeRecAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.large_rec,parent,false);
//
//        return new Viewholder(view);
//
//    }
//
//
//
//    public void onBindViewHolder(@NonNull LargeRecAdapter.Viewholder holder,int position) {
//        LargeRecModel modelLongRec=longRecArrayList.get(position);
//        holder.item_name.setText(modelLongRec.getItem_name());
//        holder.item_del.setText(modelLongRec.getItem_del());
//        holder.item_del_time.setText(modelLongRec.getItem_del_time());
//        holder.item_type1.setText(modelLongRec.getItem_type1());
//        holder.item_type2.setText(modelLongRec.getItem_type2());
//        holder.item_type3.setText(modelLongRec.getItem_type3());
//        holder.item_rate.setText(modelLongRec.getItem_rate());
//        holder.item_image.setText(modelLongRec.getItem_image());
//
////        holder.itemView.setOnClickListener(new View.OnClickListener() {
////
////            @Override
////            public void onClick(View view) {
////                Intent i=new Intent(context, ProDetails.class);
////                i.putExtra("name", longRecArrayList.get(position).getItem_name());
////                i.putExtra("image", longRecArrayList.get(position).getItem_image());
////                i.putExtra("price",longRecArrayList.get(position).getItem_price());
////                i.putExtra("desc",longRecArrayList.get(position).getItem_des());
////                i.putExtra("rate",longRecArrayList.get(position).getItem_rate());
////                context.startActivity(i);
////
////            }
////        });
//    }
//
//
//    public int getItemCount() {
//        return longRecArrayList.size();

//    }
//


//    }




