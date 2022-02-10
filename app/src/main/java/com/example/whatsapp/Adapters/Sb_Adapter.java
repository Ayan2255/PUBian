package com.example.whatsapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whatsapp.Model.ClassNotice;
import com.example.whatsapp.Model.Subject_Adaper;
import com.example.whatsapp.R;

import java.util.ArrayList;

public class Sb_Adapter extends RecyclerView.Adapter<Sb_Adapter.viewHolder>{
    ArrayList<Subject_Adaper> list;

    public Sb_Adapter(ArrayList<Subject_Adaper> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view=  LayoutInflater.from(parent.getContext()).inflate(R.layout.resorsefile,parent,false);
        viewHolder v=new viewHolder(view) ;
        return  v;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Subject_Adaper classNotice=list.get(position);
        holder.textView.setText(classNotice.getS1());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.sss);
        }
    }
}
