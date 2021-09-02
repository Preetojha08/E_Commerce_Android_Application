package com.creatures.finalinternshipproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

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

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_home_portal);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("E-Commerce App");

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

        adapter = new RecyclerViewAdapter(cat_title,cat_img,this,10);

        /*recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(adapter);*/

        HorizontalLayout = new LinearLayoutManager(HomeActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView_cat.setLayoutManager(HorizontalLayout);
        recyclerView_cat.setAdapter(adapter);


        pro_img = new ArrayList<>();
        pro_title = new ArrayList<>();

        pro_title.add("Headphone\n250 ₹");
        pro_title.add("Iphone 12\n90,000 ₹");
        pro_title.add("LV T-Shirt\n500 ₹");
        pro_title.add("SG Bat\n100 ₹");

        pro_img.add(R.drawable.headphone);
        pro_img.add(R.drawable.mobile);
        pro_img.add(R.drawable.t_shirt);
        pro_img.add(R.drawable.bat);

        adapter = new RecyclerViewAdapter(pro_title,pro_img,this,20);

        GridLayoutManager layoutManager=new GridLayoutManager(this,2);

        recyclerView_product.setLayoutManager(layoutManager);
        recyclerView_product.setAdapter(adapter);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        setTitle("NGO System Pro");
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setItemIconTintList(null);
        navigationView.setNavigationItemSelectedListener(this);



    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}