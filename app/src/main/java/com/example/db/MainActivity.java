package com.example.db;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<People> peopleList = new ArrayList<>();

        peopleList.add(new Student("1", 1));
        peopleList.add(new Student("2", 2));
        peopleList.add(new Student("3", 3));
        peopleList.add(new Student("4", 4));
        peopleList.add(new Student("5", 5));

        peopleList.add(new Teacher("1Teacher", "science"));
        peopleList.add(new Teacher("2Teacher", "math"));
        peopleList.add(new Teacher("3Teacher", "art"));

        MyAdapter myAdapter = new MyAdapter(this, peopleList);
        recyclerView.setAdapter(myAdapter);
    }
}
