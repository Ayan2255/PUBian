package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.security.keystore.StrongBoxUnavailableException;
import android.widget.TextView;

import com.example.whatsapp.databinding.ActivityMainBinding;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("EEE");
        TextView textView=findViewById(R.id.date);
       // String s= String.valueOf();





    }
}