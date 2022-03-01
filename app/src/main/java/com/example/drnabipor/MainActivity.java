package com.example.drnabipor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adaptor adaptor;
    List<LessonModel> item = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFinder();

        adaptor = new Adaptor(item, this);
        setData();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adaptor);


    }

    public void setData() {
        item.add(new LessonModel(R.drawable.biology, "Biology", "بیولوژی"));
        item.add(new LessonModel(R.drawable.biotech, "Biotechnology", "زیست فناوری"));
        item.add(new LessonModel(R.drawable.che, "Structure Biochemistry Lab.", "آزمایشگاه بیوشیمی ساختار"));
    }

    public void viewFinder() {
        recyclerView = findViewById(R.id.MRecyclerView);
    }
}