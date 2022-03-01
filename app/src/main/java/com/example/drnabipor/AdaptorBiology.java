package com.example.drnabipor;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.util.List;

public class AdaptorBiology extends Adaptor {

    public AdaptorBiology(List<LessonModel> lessonlist, Context context) {
        super(lessonlist, context);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position, @NonNull List<Object> payloads) {
        super.onBindViewHolder(holder, position, payloads);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Pdf.class);

                if (position == 0) {
                    intent.putExtra("season", 11);
                    context.startActivity(intent);
                }

                if (position == 1) {
                    intent.putExtra("season", 12);
                    context.startActivity(intent);
                }


                if (position == 2) {
                    intent.putExtra("season", 13);
                    context.startActivity(intent);
                }


                if (position == 3) {
                    intent.putExtra("season", 14);
                    context.startActivity(intent);
                }


                if (position == 4) {
                    intent.putExtra("season", 15);
                    context.startActivity(intent);
                }


                if (position == 5) {
                    intent.putExtra("season", 16);
                    context.startActivity(intent);
                }


                if (position == 6) {
                    intent.putExtra("season", 17);
                    context.startActivity(intent);
                }
            }
        });
    }


}
