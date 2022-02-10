package com.example.whatsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.Toast;

import com.example.whatsapp.Adapters.RecycleView_Adapter;
import com.example.whatsapp.Adapters.Sb_Adapter;
import com.example.whatsapp.Model.ClassNotice;
import com.example.whatsapp.Model.Subject_Adaper;
import com.example.whatsapp.databinding.ActivityShowSubBinding;
import com.example.whatsapp.databinding.ActivitySmsBinding;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Show_sub extends AppCompatActivity {
    ActivityShowSubBinding binding;
    FirebaseDatabase database;
    DatabaseReference reference;

    ArrayList<Subject_Adaper> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityShowSubBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        database=FirebaseDatabase.getInstance();
        reference=database.getReference("16");

        binding.rr.setLayoutManager(new LinearLayoutManager(this));
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list.clear();

                for (DataSnapshot snapshot1:snapshot.getChildren()){
                    Subject_Adaper classNotice =  snapshot1.getValue(Subject_Adaper.class);
                    list.add(classNotice);
                    Sb_Adapter recycleView_adapter=new  Sb_Adapter(list);

                    binding.rr.setAdapter(recycleView_adapter);
                }




            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(Show_sub.this, "wrong", Toast.LENGTH_SHORT).show();

            }
        });




    }}