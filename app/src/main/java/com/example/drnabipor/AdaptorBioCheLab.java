package com.example.drnabipor;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import androidx.annotation.NonNull;

import java.util.List;

public class AdaptorBioCheLab extends Adaptor {

    public AdaptorBioCheLab(List<LessonModel> lessonlist, Context context) {
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
                    intent.putExtra("season", 31);
                    context.startActivity(intent);
                }

                if (position == 1) {
                    intent.putExtra("season", 32);
                    context.startActivity(intent);
                }


                if (position == 2) {
                    intent.putExtra("season", 33);
                    context.startActivity(intent);
                }


                if (position == 3) {
                    intent.putExtra("season", 34);
                    context.startActivity(intent);
                }


                if (position == 4) {
                    intent.putExtra("season", 35);
                    context.startActivity(intent);
                }

            }
        });
    }
}
