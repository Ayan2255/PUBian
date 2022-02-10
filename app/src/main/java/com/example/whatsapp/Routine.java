        package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.whatsapp.Adapters.Fragment_Adapter;
import com.example.whatsapp.databinding.ActivityRoutineBinding;

     public class Routine extends AppCompatActivity {
     ActivityRoutineBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRoutineBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.viewPager.setAdapter(new Fragment_Adapter(getSupportFragmentManager()));
         binding.tabLayout.setupWithViewPager(binding.viewPager);

    }
}