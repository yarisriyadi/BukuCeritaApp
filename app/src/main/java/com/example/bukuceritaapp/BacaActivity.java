package com.example.bukuceritaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BacaActivity extends AppCompatActivity {

    Toolbar toolbar;
    private RecyclerView rvBuku;
    private ArrayList<Buku> list = new ArrayList<>();
    private CardViewBukuAdapater cardViewBukuAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baca);

        rvBuku = findViewById(R.id.rvBuku);
        rvBuku.setHasFixedSize(true);

        list.addAll(DataBuku.getListData());
        showRecyclerCardView();

        Toolbar toolbarsearch = findViewById(R.id.toolbarbaca);
        setSupportActionBar(toolbarsearch);
        getSupportActionBar().setTitle("");

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    private void showRecyclerCardView() {
        rvBuku.setLayoutManager(new LinearLayoutManager(this));
        cardViewBukuAdapter = new CardViewBukuAdapater(list);
        rvBuku.setAdapter(cardViewBukuAdapter);

        cardViewBukuAdapter.setOnItemClickCallback(new CardViewBukuAdapater.OnItemClickCallback() {
            @Override
            public void onItemClicked(Buku buku) {
                Intent move = new Intent(BacaActivity.this, DetailActivity.class);
                move.putExtra(DetailActivity.ITEM_EXTRA, buku);
                startActivity(move);
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(BacaActivity.this, HomeActivity.class));
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            startActivity(new Intent(BacaActivity.this, HomeActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        MenuItem menuItem = menu.findItem(R.id.searchId);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Ketik di sini untuk mencari");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // Tidak perlu mengimplementasikan apa pun di sini
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                searchBuku(newText);
                return true;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    private void searchBuku(String keyword) {
        List<Buku> filteredList = new ArrayList<>();
        for (Buku buku : list) {
            if (buku.getNama().toLowerCase().contains(keyword.toLowerCase())) {
                filteredList.add(buku);
            }
        }
        cardViewBukuAdapter.setFilter(filteredList.toString());

        // Jika Anda ingin menghapus kode berikut, karena sudah menggunakan filteredList di atas
        // String filterText = "teks_yang_dicari";
        // cardViewBukuAdapter.setFilter(filterText);
    }
}
