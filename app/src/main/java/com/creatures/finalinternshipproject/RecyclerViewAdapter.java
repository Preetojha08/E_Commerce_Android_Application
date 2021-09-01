package com.creatures.finalinternshipproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.card_view_holder> {

    List<String> title;
    List<Integer> images;
    LayoutInflater layoutInflater;
    Context context;

    public RecyclerViewAdapter(List<String> title, List<Integer> images, Context context) {
        this.title = title;
        this.images = images;
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public card_view_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view_oncreate;
        view_oncreate = layoutInflater.inflate(R.layout.card_layout,parent,false);
        return new card_view_holder(view_oncreate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.card_view_holder holder, int position) {

        holder.cat_btn.setText(title.get(position));
        holder.cat_img_v.setImageResource(images.get(position));

    }

    @Override
    public int getItemCount() {
        return images.size();
    }


    public class card_view_holder extends RecyclerView.ViewHolder
    {
        ImageView cat_img_v;
        Button cat_btn;

        public card_view_holder(@NonNull  View itemView) {
            super(itemView);
            cat_btn=(Button)itemView.findViewById(R.id.btn_cat);
            cat_img_v=(ImageView)itemView.findViewById(R.id.image_view_cat);
        }
    }
    
    
}
