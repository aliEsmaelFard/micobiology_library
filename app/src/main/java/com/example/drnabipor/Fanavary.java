package com.example.drnabipor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Fanavary extends AppCompatActivity {

    RecyclerView recyclerView;
    Adaptor adaptor;
    List<LessonModel> item = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fanavary);

        Toolbar toolbar;
        toolbar = findViewById(R.id.fanToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.Recfara);
        adaptor = new AdaptorFanavary(item, this);
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
        item.add(new LessonModel(R.drawable.fan1, getString(R.string.fasl1), getString(R.string.f1)));
        item.add(new LessonModel(R.drawable.fan2, getString(R.string.fasl2), getString(R.string.f2)));
        item.add(new LessonModel(R.drawable.fan3, getString(R.string.fasl3), getString(R.string.f3)));
        item.add(new LessonModel(R.drawable.fan4, getString(R.string.fasl4), getString(R.string.f4)));
        item.add(new LessonModel(R.drawable.fan5, getString(R.string.fasl5), getString(R.string.f5)));

    }
}

