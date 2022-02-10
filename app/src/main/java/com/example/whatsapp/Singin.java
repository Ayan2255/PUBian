package com.example.whatsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.whatsapp.databinding.ActivitySinginBinding;
import com.example.whatsapp.databinding.ActivitySingupBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

public class Singin extends AppCompatActivity {
    ActivitySinginBinding binding;
    ProgressDialog progressDialog;
    FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySinginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        firebaseAuth=FirebaseAuth.getInstance();
        progressDialog=new ProgressDialog(Singin.this);
        progressDialog.setTitle("Login");
        progressDialog.setMessage("Login to  your account");



        binding.SinginButtom.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                progressDialog.show();
                firebaseAuth.signInWithEmailAndPassword(binding.Email.getText().toString(),binding.Password.getText().toString()).
                        addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progressDialog.dismiss();
                                if (task.isSuccessful()){
                                    Intent it =new Intent(Singin.this,Home.class);
                                    startActivity(it);
                                    Toast.makeText(Singin.this, "LOGIN", Toast.LENGTH_SHORT).show();
                                }
                                else {
                                    Toast.makeText(Singin.this,task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        });

            }
        });
        if (firebaseAuth.getCurrentUser()!=null){
            Intent it =new Intent(Singin.this,Home.class);
            startActivity(it);
        }
        binding.goSingup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Singin.this,Singup.class);
                startActivity(intent);
            }
        });

    }
}