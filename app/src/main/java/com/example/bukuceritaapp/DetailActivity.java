package com.example.bukuceritaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    private ImageView imgPhoto;
    private TextView tvNama, tvDesc;

    Toolbar toolbar;

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        imgPhoto = findViewById(R.id.iv_item_photo);
        tvNama = findViewById(R.id.tvTitle);
        tvDesc = findViewById(R.id.tvDesc);

        toolbar = findViewById(R.id.toolbardetail);
        setSupportActionBar(toolbar);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        Buku Buku = getIntent().getParcelableExtra(ITEM_EXTRA);
        if (Buku != null){
            Glide.with(this)
                    .load(Buku.getPhoto())
                    .into(imgPhoto);
            tvNama.setText(Buku.getNama());
            tvDesc.setText(Buku.getDetail());
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Rukun-Rukun Salat");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(DetailActivity.this, BacaActivity.class));
        finish();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            startActivity(new Intent(DetailActivity.this, BacaActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}