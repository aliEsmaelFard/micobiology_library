package com.example.drnabipor;

import android.content.Context;
import android.content.Intent;
import android.content.SyncStatusObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.ls.LSException;

import java.util.List;

public class Adaptor extends  RecyclerView.Adapter<Adaptor.MyViewHolder>{

    List<LessonModel> lessonlist;
    Context context;

    public Adaptor(List<LessonModel> lessonlist, Context context) {
        this.lessonlist = lessonlist;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview , parent , false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        LessonModel lesson = lessonlist.get(position);

        holder.Avatar.setImageResource(lesson.getAvatar());
        holder.TitleNumber.setText(lesson.getNumber());
        holder.Title.setText(lesson.getTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position == 0){
                    Intent intent = new Intent(context , Biology.class);
                    context.startActivity(intent);
                }

                else if(position == 1){
                    Intent intent = new Intent(context , Fanavary.class);
                    context.startActivity(intent);
                }

                else if(position == 2){
                    Intent intent = new Intent(context , BioCheStruLabra.class);
                    context.startActivity(intent);
                }



            }
        });
    }

    @Override
    public int getItemCount() {
        return lessonlist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView Avatar;
        public TextView  TitleNumber;
        public TextView Title;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            Avatar = itemView.findViewById(R.id.avatar);
            Title = itemView.findViewById(R.id.maintext);
            TitleNumber = itemView.findViewById(R.id.numtext);

        }
    }
}
