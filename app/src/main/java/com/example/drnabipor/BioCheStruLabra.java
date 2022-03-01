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

public class BioCheStruLabra extends AppCompatActivity {


    RecyclerView recyclerView;
    Adaptor adaptor;
    List<LessonModel> item = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biochestrulabra);
        viewFinder();


        Toolbar toolbar;
        toolbar = findViewById(R.id.labToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        adaptor = new AdaptorBioCheLab(item, this);
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
        item.add(new LessonModel(R.drawable.che1, getString(R.string.fasl1), getString(R.string.c1)));
        item.add(new LessonModel(R.drawable.che2, getString(R.string.fasl2), getString(R.string.c2)));
        item.add(new LessonModel(R.drawable.che3, getString(R.string.fasl3), getString(R.string.c3)));
        item.add(new LessonModel(R.drawable.che4, getString(R.string.fasl4), getString(R.string.c4)));
        item.add(new LessonModel(R.drawable.che5, getString(R.string.fasl5), getString(R.string.c5)));
    }

    public void viewFinder() {

        recyclerView = findViewById(R.id.recLab);

    }
}

