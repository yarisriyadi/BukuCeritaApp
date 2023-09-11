package com.example.bukuceritaapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CardViewBukuAdapater extends RecyclerView.Adapter<CardViewBukuAdapater.CardViewHolder> {
    private static ArrayList<Buku> listBuku;
    private ArrayList<Buku> originalList;
    private OnItemClickCallback onItemClickCallback;

    public CardViewBukuAdapater(ArrayList<Buku> list) {
        this.originalList = new ArrayList<>(list);
        this.listBuku = list;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_baca, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Buku Buku = listBuku.get(position);
        Glide.with(holder.itemView.getContext())
                .load(Buku.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
        holder.tvNama.setText(Buku.getNama());
        holder.tvDetail.setText(Buku.getDetail());
        holder.btnBaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listBuku.get(holder.getAdapterPosition()));
                Toast.makeText(holder.itemView.getContext(), listBuku.get(holder.getAdapterPosition()).getNama(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listBuku.get(holder.getAdapterPosition()));
                Toast.makeText(holder.itemView.getContext(), listBuku.get(holder.getAdapterPosition()).getNama(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBuku.size();
    }

    public static class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNama, tvDetail;
        Button btnBaca;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.iv_item_photo);
            tvNama = itemView.findViewById(R.id.tvTitle);
            tvDetail = itemView.findViewById(R.id.tvDesc);
            btnBaca = itemView.findViewById(R.id.btnBaca);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Buku Buku);
    }

    // Metode ini digunakan untuk melakukan pencarian atau penyaringan pada data buku
    public void setFilter(String filterText) {
        filterText = filterText.toLowerCase(Locale.getDefault());
        listBuku.clear();
        if (filterText.length() == 0) {
            listBuku.addAll(originalList);
        } else {
            for (Buku buku : originalList) {
                if (buku.getNama().toLowerCase(Locale.getDefault()).contains(filterText)) {
                    listBuku.add(buku);
                }
            }
        }
        notifyDataSetChanged(); // Perbarui tampilan daftar buku
    }
}

