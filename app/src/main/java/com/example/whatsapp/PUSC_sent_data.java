package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.whatsapp.Model.ClassNotice;
import com.example.whatsapp.databinding.ActivityNoticeSentBinding;
import com.example.whatsapp.databinding.ActivityPupcDataSentBinding;
import com.example.whatsapp.databinding.ActivityPuscSentDataBinding;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PUSC_sent_data extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference reference;
    ActivityPuscSentDataBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pusc_sent_data);
        setContentView(R.layout.activity_pupc_data_sent);
        binding= ActivityPuscSentDataBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        database= FirebaseDatabase.getInstance();
        binding.PuscNoticeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassNotice notice;
                reference=database.getReference().child("PUSC_Notice");
                notice = new ClassNotice(binding.PuscNoticeText.getText().toString());
                reference.push().setValue(notice);
                Toast.makeText(PUSC_sent_data.this, "Sent SMS", Toast.LENGTH_SHORT).show();
                onBackPressed();
            }
        });
    }
}