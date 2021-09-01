package com.creatures.finalinternshipproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    RecyclerView recyclerView_cat,recyclerView_product;

    List<String> cat_title;
    List<Integer> cat_img;

    List<String> pro_title;
    List<Integer> pro_img;

    LinearLayoutManager HorizontalLayout;
    RecyclerViewAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView_cat=(RecyclerView)findViewById(R.id.recyclerView_Categories);
        recyclerView_product=(RecyclerView)findViewById(R.id.recyclerView_product);

        cat_title = new ArrayList<>();
        cat_img = new ArrayList<>();

        cat_title.add("Electronic");
        cat_title.add("Grocery");
        cat_title.add("Sports");
        cat_title.add("Clothes");

        cat_img.add(R.drawable.electronic);
        cat_img.add(R.drawable.food);
        cat_img.add(R.drawable.sports);
        cat_img.add(R.drawable.cloths);

        adapter = new RecyclerViewAdapter(cat_title,cat_img,this);

        /*recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(adapter);*/

        HorizontalLayout = new LinearLayoutManager(HomeActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView_cat.setLayoutManager(HorizontalLayout);
        recyclerView_cat.setAdapter(adapter);


        pro_img = new ArrayList<>();
        pro_title = new ArrayList<>();

        pro_title.add("Headphone");
        pro_title.add("Iphone 12");
        pro_title.add("LV T-Shirt");
        pro_title.add("SG Bat");

        pro_img.add(R.drawable.headphone);
        pro_img.add(R.drawable.mobile);
        pro_img.add(R.drawable.t_shirt);
        pro_img.add(R.drawable.bat);

        adapter = new RecyclerViewAdapter(pro_title,pro_img,this);

        GridLayoutManager layoutManager=new GridLayoutManager(this,2);

        recyclerView_product.setLayoutManager(layoutManager);
        recyclerView_product.setAdapter(adapter);





    }
}