package com.example.drnabipor;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import androidx.annotation.NonNull;

import java.util.List;

public class AdaptorFanavary extends Adaptor {

    public AdaptorFanavary(List<LessonModel> lessonlist, Context context) {
        super(lessonlist, context);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, Pdf.class);

                if (position == 0) {
                    intent.putExtra("season", 21);
                    context.startActivity(intent);
                } else if (position == 1) {
                    intent.putExtra("season", 22);
                    context.startActivity(intent);
                } else if (position == 2) {
                    intent.putExtra("season", 23);
                    context.startActivity(intent);
                } else if (position == 3) {
                    intent.putExtra("season", 24);
                    context.startActivity(intent);
                } else if (position == 4) {
                    intent.putExtra("season", 25);
                    context.startActivity(intent);
                }

            }
        });
    }
}