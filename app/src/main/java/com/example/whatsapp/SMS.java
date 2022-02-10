package com.example.whatsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.whatsapp.Adapters.RecycleView_Adapter;
import com.example.whatsapp.Model.ClassNotice;
import com.example.whatsapp.databinding.ActivitySmsBinding;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class SMS extends AppCompatActivity {
     ActivitySmsBinding binding;
     FirebaseDatabase database;
     DatabaseReference reference;

     ArrayList<ClassNotice> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySmsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        database=FirebaseDatabase.getInstance();
        reference=database.getReference("Notice");

        binding.r.setLayoutManager(new LinearLayoutManager(this));
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list.clear();

                for (DataSnapshot snapshot1:snapshot.getChildren()){
                    ClassNotice classNotice =  snapshot1.getValue(ClassNotice.class);
                    list.add(classNotice);

                    LinearLayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
                    //   layoutManager.setReverseLayout(true);
                    layoutManager.setStackFromEnd(true);
                    RecycleView_Adapter recycleView_adapter=new RecycleView_Adapter(list);

                    binding.r.setLayoutManager(layoutManager);

                    binding.r.setAdapter(recycleView_adapter);
                }




            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(SMS.this, "wrong", Toast.LENGTH_SHORT).show();

            }
        });


       




       //LinearLayoutManager layoutManager=new LinearLayoutManager(getBaseContext());



    }
}