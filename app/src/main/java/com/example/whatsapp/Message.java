package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.whatsapp.Adapters.Fragment_Adapter;
import com.example.whatsapp.abc.abc;
import com.example.whatsapp.databinding.ActivityMainBinding;
import com.example.whatsapp.databinding.ActivityMessageBinding;

public class Message extends AppCompatActivity {
    ActivityMessageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        binding.smsView.setAdapter(new abc(getSupportFragmentManager()));
        binding.smsTab.setupWithViewPager(binding.smsView);

    }
}