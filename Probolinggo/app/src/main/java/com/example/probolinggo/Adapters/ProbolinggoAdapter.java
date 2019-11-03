package com.example.probolinggo.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.probolinggo.Models.ProbolinggoModel;
import com.example.probolinggo.R;

import java.util.ArrayList;

public class ProbolinggoAdapter extends RecyclerView.Adapter<ProbolinggoAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<ProbolinggoModel> mlist;
    public ProbolinggoAdapter(Context context, ArrayList<ProbolinggoModel> list) {
        mContext = context;
        mlist = list;
    }

    @NonNull
    @Override
    public ProbolinggoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.probolinggo,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProbolinggoAdapter.ViewHolder holder, int position) {
        ProbolinggoModel probolinggoModel = mlist.get(position);
        ImageView image = holder.probolinggoImage;
        TextView ttl, dsc;
        ttl = holder.probolinggoTitle;
        dsc = holder.probolinggoDescription;
        image.setImageResource(probolinggoModel.image);
        ttl.setText(probolinggoModel.title);
        dsc.setText(probolinggoModel.description);
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView probolinggoImage;
        TextView probolinggoTitle, probolinggoDescription;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            probolinggoImage = itemView.findViewById(R.id.image);
            probolinggoTitle = itemView.findViewById(R.id.title);
            probolinggoDescription = itemView.findViewById(R.id.description);
        }
    }
}
