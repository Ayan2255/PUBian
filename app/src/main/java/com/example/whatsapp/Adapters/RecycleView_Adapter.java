package com.example.whatsapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whatsapp.Model.Admin_model;
import com.example.whatsapp.Model.ClassNotice;
import com.example.whatsapp.Model.Routine_RecycleView;
import com.example.whatsapp.R;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
public class RecycleView_Adapter extends RecyclerView.Adapter<RecycleView_Adapter.viewHolder>
{
ArrayList<ClassNotice>list;


    public RecycleView_Adapter(ArrayList<ClassNotice> list) {
        this.list=list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


      View view=  LayoutInflater.from(parent.getContext()).inflate(R.layout.resorsefile,parent,false);
      viewHolder v=new viewHolder(view);
        return  v;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {


        ClassNotice classNotice=list.get(position);
         holder.textView.setText(classNotice.getA());
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
