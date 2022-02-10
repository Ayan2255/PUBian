package com.example.whatsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.Toast;

import com.example.whatsapp.Adapters.RecycleView_Adapter;
import com.example.whatsapp.Model.ClassNotice;
import com.example.whatsapp.databinding.ActivityPuscGetDataBinding;
import com.example.whatsapp.databinding.ActivitySmsBinding;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class PUSC_get_data extends AppCompatActivity {

    ActivityPuscGetDataBinding binding;
    FirebaseDatabase database;
    DatabaseReference reference;

    ArrayList<ClassNotice> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityPuscGetDataBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        database=FirebaseDatabase.getInstance();
        reference=database.getReference("PUSC_Notice");

        binding.rPusc.setLayoutManager(new LinearLayoutManager(this));
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

                    binding.rPusc.setLayoutManager(layoutManager);


                    binding.rPusc.setAdapter(recycleView_adapter);
                }


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PUSC_get_data.this, "wrong", Toast.LENGTH_SHORT).show();

            }
        });




    }
}