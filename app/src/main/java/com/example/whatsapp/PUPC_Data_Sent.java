package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.whatsapp.Model.ClassNotice;
import com.example.whatsapp.databinding.ActivityNoticeSentBinding;
import com.example.whatsapp.databinding.ActivityPupcDataSentBinding;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PUPC_Data_Sent extends AppCompatActivity {
ActivityPupcDataSentBinding binding;
FirebaseDatabase database;
DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pupc_data_sent);
        binding= ActivityPupcDataSentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        database= FirebaseDatabase.getInstance();
        binding.PupcNoticeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassNotice notice;
                reference=database.getReference().child("PUPC_Notice");
                notice = new ClassNotice(binding.PupcNoticeText.getText().toString());
                reference.push().setValue(notice);
                Toast.makeText(PUPC_Data_Sent.this, "Sent SMS", Toast.LENGTH_SHORT).show();
                onBackPressed();
            }
        });
    }
}