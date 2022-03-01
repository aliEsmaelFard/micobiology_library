package com.example.drnabipor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Biology extends AppCompatActivity {

    RecyclerView recyclerView;
    Adaptor adaptor;
    List<LessonModel> item = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biology);

        Toolbar toolbar;
        toolbar = findViewById(R.id.bioToolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.RecyclerView);
        adaptor = new AdaptorBiology(item, this);
        setData();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adaptor);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);

    }

    public void setData() {
        item.add(new LessonModel(R.drawable.bioentero, getString(R.string.fasl1), getString(R.string.b1)));
        item.add(new LessonModel(R.drawable.cell, getString(R.string.fasl2), getString(R.string.b2)));
        item.add(new LessonModel(R.drawable.tissue, getString(R.string.fasl3), getString(R.string.b3)));
        item.add(new LessonModel(R.drawable.oragan, getString(R.string.fasl4), getString(R.string.b4)));
        item.add(new LessonModel(R.drawable.heart, getString(R.string.fasl5), getString(R.string.b5)));
        item.add(new LessonModel(R.drawable.lungs, getString(R.string.fasl6), getString(R.string.b6)));
        item.add(new LessonModel(R.drawable.stomach, getString(R.string.fasl7), getString(R.string.b7)));

    }
}