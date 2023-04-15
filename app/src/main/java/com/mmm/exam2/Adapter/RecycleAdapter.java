package com.mmm.exam2.Adapter;

import static com.mmm.exam2.Utils.utils.image;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.mmm.exam2.R;
import com.mmm.exam2.musicModles;

import java.util.ArrayList;

public class RecycleAdapter extends RecyclerView.Adapter <RecycleAdapter.MusicHolder>{

ArrayList<musicModles> dataList;


Context context;
    public RecycleAdapter(ArrayList<musicModles> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MusicHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.iteam_music,parent,false);
        return new MusicHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicHolder holder, int position) {
        Glide.with(context).load(  image [position]).into(holder.image);

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class  MusicHolder extends RecyclerView.ViewHolder {


        TextView txtSongName,singername,txtYear,txtRating;

        ImageView image;


        public MusicHolder(@NonNull View itemView) {
            super(itemView);
            txtSongName = itemView.findViewById(R.id.txtSongname);
            singername = itemView.findViewById(R.id.txtSingername);
            txtYear = itemView.findViewById(R.id.txtRating);
            txtRating = itemView.findViewById(R.id.txtYear);
            image = itemView.findViewById(R.id.img);




        }





    }


}
