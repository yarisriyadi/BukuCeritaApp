package com.example.bukuceritaapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class HomeActivity extends AppCompatActivity {

    private CardView baca, about, exit;
    private TextView firebasenameview;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        baca = findViewById(R.id.bacabuku);
        about = findViewById(R.id.tentang);
        exit = findViewById(R.id.exit);
        firebasenameview = findViewById(R.id.Username);

        mAuth = FirebaseAuth.getInstance();
        FirebaseUser muser = mAuth.getCurrentUser();

        // Tampilkan username saat aktivitas dibuat
        displayUsername();


        baca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, BacaActivity.class);
                startActivity(intent);
            }
        });

        //About
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });

        // Exit
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                confirmLogout();
            }
        });
    }

    // Method untuk menampilkan username
    private void displayUsername() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String username = preferences.getString("username", "");

        if (!username.isEmpty()) {
            firebasenameview.setText("Welcome, " + username);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Pastikan username ditampilkan saat aktivitas dibuka kembali
        displayUsername();
    }

    // Konfirmasi logout
    private void confirmLogout() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(HomeActivity.this);
        alertDialogBuilder.setMessage("Apakah Kamu Ingin Keluar?");

        alertDialogBuilder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(HomeActivity.this, "Berhasil Keluar", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomeActivity.this, LoginActivity.class));
                finish(); // Tambahkan ini agar aktivitas saat ini ditutup setelah logout.
            }
        });

        alertDialogBuilder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                // Tidak lakukan apa-apa jika tombol "Tidak" ditekan.
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(HomeActivity.this, LoginActivity.class));
        finish();
    }
}
