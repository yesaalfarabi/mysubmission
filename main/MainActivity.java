package com.example.mysubmission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{   private RecyclerView rv_category;
    private ArrayList<Motor> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_category= findViewById(R.id.rv_category);
        rv_category.setHasFixedSize(true);
        list.addAll(MotorData.getListData());
        showRecyclerviewlistMotor();
    }

    private void showRecyclerviewlistMotor()
    {
        rv_category.setLayoutManager(new LinearLayoutManager(this));
        ListMotorAdapter ListMA = new ListMotorAdapter(this);
        ListMA.setListMotor(list);
        rv_category.setAdapter(ListMA);

        ClickListener.addTo(rv_category).setOnItemClickListener(new ClickListener.OnItemClickListener()
        {   @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v)
        { showSelectedMotor(list.get(position)); }
        });
    }

    private void showSelectedMotor(Motor motor)
    {   Toast.makeText(this, "Pilihanmu"+ motor.getName(), Toast.LENGTH_SHORT).show();
        Intent move = new Intent(MainActivity.this, DetailMotor.class);
        move.putExtra(DetailMotor.Extra_Name, motor.getName());
        startActivity(move);
    }
}