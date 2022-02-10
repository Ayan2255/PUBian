package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.whatsapp.databinding.ActivityAdminLoginBinding;

public class Admin_Login extends AppCompatActivity {
   ActivityAdminLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAdminLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();


        binding.AdminButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=binding.userName.getText().toString();
                String pass=binding.UserPassword.getText().toString();
                if (((user.equals("PUB")) || (user.equals("pub"))|| (user.equals("Pub"))) && pass.equals("#999"))
                {
                    Intent intent =new Intent(Admin_Login.this,Admin_Home.class);

                    Toast.makeText(Admin_Login.this,"Wellcome", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
                else {  Toast.makeText(Admin_Login.this,"Incorrect Login Information ", Toast.LENGTH_SHORT).show();}


            }
        });


    }
}
