package com.example.pinjambuku.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pinjambuku.Model.DataModel;
import com.example.pinjambuku.R;

import java.util.List;

public class AdapterData extends  RecyclerView.Adapter<AdapterData.HolderData>{
    private Context ctx;
    private List<DataModel> listPeminjam;

    public AdapterData(Context ctx, List<DataModel> listPeminjam) {
        this.ctx = ctx;
        this.listPeminjam = listPeminjam;
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        HolderData holder = new HolderData(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderData holder, int position) {
        DataModel dm = listPeminjam.get(position);

        holder.tvId.setText(String.valueOf(dm.getId()));
        holder.tvNama.setText(dm.getNama());
        holder.tvJudulbuku.setText(dm.getJudul_buku());
        holder.tvTglpinjam.setText(dm.getTgl_pinjam());
        holder.tvTglkembalikan.setText(dm.getTgl_kembalikan());
    }

    @Override
    public int getItemCount() {
        return listPeminjam.size();
    }

    public class HolderData extends RecyclerView.ViewHolder {
        TextView tvId, tvNama, tvNIM, tvJudulbuku, tvTglpinjam, tvTglkembalikan;

        public HolderData(@NonNull View itemView) {
            super(itemView);

            tvId = itemView.findViewById(R.id.tv_id);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvNIM = itemView.findViewById(R.id.tv_nim);
            tvJudulbuku = itemView.findViewById(R.id.tv_judulbuku);
            tvTglpinjam = itemView.findViewById(R.id.tv_tglpinjam);
            tvTglkembalikan = itemView.findViewById(R.id.tv_tglkembalikan);
        }
    }
}
