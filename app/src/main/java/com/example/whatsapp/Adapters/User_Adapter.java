package com.example.whatsapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whatsapp.Model.user;
import com.example.whatsapp.R;
import com.google.firebase.firestore.auth.User;


import java.util.ArrayList;

public class   User_Adapter extends RecyclerView.Adapter<User_Adapter.ViewHolder> {

       ArrayList<user>list;
       Context context;

    public User_Adapter(ArrayList<user> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_show_user,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        user user= list.get(position);
        String s = null;

        holder.user_name.setText(user.getUserName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class  ViewHolder extends  RecyclerView.ViewHolder{

        ImageView image;
        TextView user_name,lasr_message;
        public ViewHolder(@NonNull View itemView) {

            super(itemView);



            image=itemView.findViewById(R.id.profile_image);
            user_name=itemView.findViewById(R.id.user_name);
            lasr_message=itemView.findViewById(R.id.last_message);


        }
    }
}
