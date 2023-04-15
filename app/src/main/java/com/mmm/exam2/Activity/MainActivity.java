package com.mmm.exam2.Activity;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mmm.exam2.Adapter.RecycleAdapter;
import com.mmm.exam2.R;
import com.mmm.exam2.musicModles;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<musicModles>  dataList = new ArrayList<>();

RecyclerView rcvlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         rcvlist = findViewById(R.id.rcvlist);


        rcvlist.setLayoutManager(new LinearLayoutManager(this));
        rcvlist.setAdapter(new RecycleAdapter(dataList));





    }
}