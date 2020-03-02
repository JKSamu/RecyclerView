package com.samu.rexylerview;

import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;


public class MainActivity_1 extends AppCompatActivity {

//-------------------for recyclerview--1
    //a list to store all the products1
    List<Product1> product1List;

    //the recyclerview
    RecyclerView recyclerView;
//-------------------for recyclerview--1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //--------toolbar--------
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //---------------

        //----------FloatingActionButton--------
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //------------FloatingActionButton-----


 // for recycler view--2

        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.re);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager= new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        recyclerView.setLayoutManager(layoutManager);

        //initializing the productlist
        product1List = new ArrayList<>();


        //adding some items to our list
        //adding some items to our list
        product1List.add(
                new Product1(
                        1,
                        "3 McLaren 570S",
                        "5204cc, 10 cylinders",
                        9.3,
                        700000,
                        R.drawable.aa));

        product1List.add(
                new Product1(
                        1,
                        "4 Mercedes-AMG GT",
                        "2981cc, 6 cylinders",
                        5.3,
                        100000,
                        R.drawable.bb));

        product1List.add(
                new Product1(
                        1,
                        "5 BMW i8",
                        "3799cc, 8 cylinders S (£110,500)",
                        8.3,
                        80000,
                        R.drawable.dd));

        product1List.add(
                new Product1(
                        1,
                        "3 McLaren 570S",
                        "Mercedes-AMG GT S (£110,500)",
                        8.3,
                        60000,
                        R.drawable.ee));

        //creating recyclerview adapter
        ProductAdapter_1 adapter = new ProductAdapter_1(this, product1List);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

        //---------for recycler view--2

    }//slb


    //---------menu----------
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    //------------------  //---------menu----------

}//lb
