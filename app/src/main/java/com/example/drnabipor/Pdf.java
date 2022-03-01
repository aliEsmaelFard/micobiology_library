package com.example.drnabipor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.shockwave.pdfium.PdfDocument;

public class Pdf extends AppCompatActivity {

    PDFView pdfView;
    Toolbar toolbar;
    int pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);

        toolbar = findViewById(R.id.pdfToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pdfView = findViewById(R.id.pdfView);
        setPdf();

    }

    public void setPdf() {

        pager = getIntent().getIntExtra("season", 0);

        switch (pager) {

            //biology
            case 11:
                toolbar.setTitle(getString(R.string.b1));
                displayFromAsset("bio1.pdf");
                break;

            case 12:
                toolbar.setTitle(getString(R.string.b2));
                displayFromAsset("bio2.pdf");
                break;

            case 13:
                toolbar.setTitle(getString(R.string.b3));
                displayFromAsset("bio3.pdf");
                break;

            case 14:
                toolbar.setTitle(getString(R.string.b4));
                displayFromAsset("bio4.pdf");
                break;

            case 15:
                toolbar.setTitle(getString(R.string.b5));
                displayFromAsset("bio5.pdf");
                break;

            case 16:
                toolbar.setTitle(getString(R.string.b6));
                displayFromAsset("bio6.pdf");
                break;

            case 17:
                toolbar.setTitle(getString(R.string.b7));
                displayFromAsset("bio7.pdf");
                break;

            //Fanavary
            case 21:
                toolbar.setTitle(getString(R.string.f1));
                displayFromAsset("fan1.pdf");
                break;

            case 22:
                toolbar.setTitle(getString(R.string.f2));
                displayFromAsset("fan2.pdf");
                break;

            case 23:
                toolbar.setTitle(getString(R.string.f3));
                displayFromAsset("fan3.pdf");
                break;

            case 24:
                toolbar.setTitle(getString(R.string.f4));
                displayFromAsset("fan4.pdf");
                break;

            case 25:
                toolbar.setTitle(getString(R.string.f5));
                displayFromAsset("fan5.pdf");
                break;

            //bioChe lab.
            case 31:
                toolbar.setTitle(getString(R.string.c1));
                displayFromAsset("che1.pdf");
                break;

            case 32:
                toolbar.setTitle(getString(R.string.c2));
                displayFromAsset("che2.pdf");
                break;

            case 33:
                toolbar.setTitle(getString(R.string.c3));
                displayFromAsset("che3.pdf");
                break;

            case 34:
                toolbar.setTitle(getString(R.string.c4));
                displayFromAsset("che4.pdf");
                break;

            case 35:
                toolbar.setTitle(getString(R.string.c5));
                displayFromAsset("che5.pdf");
                break;
        }
    }


    private void displayFromAsset(String asset) {

        pdfView.fromAsset(asset)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableAnnotationRendering(true)
                .scrollHandle(new DefaultScrollHandle(this))
                .load();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }


}