package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.whatsapp.Model.ClassNotice;
import com.example.whatsapp.databinding.ActivityNoticeSentBinding;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Notice_Sent extends AppCompatActivity {
      ActivityNoticeSentBinding binding;
      FirebaseDatabase database;
      DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityNoticeSentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        database=FirebaseDatabase.getInstance();
        binding.NoticeTextSentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassNotice notice;
                reference=database.getReference().child("Notice");
                notice = new ClassNotice(binding.NoticeText.getText().toString());
                reference.push().setValue(notice);
                Toast.makeText(Notice_Sent.this, "Sent SMS", Toast.LENGTH_SHORT).show();
                onBackPressed();
            }
        });


    }
}