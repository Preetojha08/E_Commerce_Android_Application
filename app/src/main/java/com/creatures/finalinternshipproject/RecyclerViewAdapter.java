package com.creatures.finalinternshipproject;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.card_view_holder> {

    List<String> title;
    List<Integer> images;
    LayoutInflater layoutInflater;
    Context context;
    int card_val=0;

    public RecyclerViewAdapter(List<String> title, List<Integer> images, Context context,int card_val) {
        this.title = title;
        this.images = images;
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.card_val = card_val;
    }

    @NonNull
    @Override
    public card_view_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view_oncreate;

        if (card_val==10){
            view_oncreate = layoutInflater.inflate(R.layout.card_layout,parent,false);
        }
        else if (card_val==20){
            view_oncreate = layoutInflater.inflate(R.layout.product_card,parent,false);
        }
       else {
            view_oncreate = layoutInflater.inflate(R.layout.card_layout,parent,false);
        }
        return new card_view_holder(view_oncreate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.card_view_holder holder, int position) {

        if (card_val==10){
            holder.cat_btn.setText(title.get(position));
            holder.cat_img_v.setImageResource(images.get(position));
        }
        else if (card_val==20){
            holder.tv_product.setText(title.get(position));
            holder.img_pro.setImageResource(images.get(position));
        }
        else {
            holder.cat_btn.setText(title.get(position));
            holder.cat_img_v.setImageResource(images.get(position));
        }


    }

    @Override
    public int getItemCount() {
        return images.size();
    }


    public class card_view_holder extends RecyclerView.ViewHolder
    {
        ImageView cat_img_v;
        Button cat_btn;

        TextView tv_product;
        ImageView img_pro;

        public card_view_holder(@NonNull  View itemView) {
            super(itemView);

            if (card_val==10){
                cat_btn=(Button)itemView.findViewById(R.id.btn_cat);
                cat_img_v=(ImageView)itemView.findViewById(R.id.image_view_cat);
            }
            if (card_val==20){
                img_pro=(ImageView)itemView.findViewById(R.id.image_view_product);
                tv_product=(TextView)itemView.findViewById(R.id.text_view_product);
            }
        }
    }
    
    
}
