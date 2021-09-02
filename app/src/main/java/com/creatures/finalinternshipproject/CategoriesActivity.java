package com.creatures.finalinternshipproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CategoriesActivity extends AppCompatActivity {

    List<String> cat_title;
    List<Integer> cat_img;

    RecyclerView category_recycler_view;
    RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_category);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Shop By Categories");

        category_recycler_view=(RecyclerView)findViewById(R.id.categories_recycler_view);

        cat_title = new ArrayList<>();
        cat_img = new ArrayList<>();

        cat_title.add("Electronic");
        cat_title.add("Grocery");
        cat_title.add("Toys and Games");
        cat_title.add("Sports");
        cat_title.add("Clothes");
        cat_title.add("Automobile Accessories");
        cat_title.add("Books");


        cat_img.add(R.drawable.electronic);
        cat_img.add(R.drawable.food);
        cat_img.add(R.drawable.toys);
        cat_img.add(R.drawable.sports);
        cat_img.add(R.drawable.cloths);
        cat_img.add(R.drawable.car);
        cat_img.add(R.drawable.books);


        adapter = new RecyclerViewAdapter(cat_title,cat_img,this,10);

        category_recycler_view.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        category_recycler_view.setAdapter(adapter);

    }
}