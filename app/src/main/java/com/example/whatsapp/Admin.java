package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.whatsapp.Model.Admin_model;
import com.example.whatsapp.Model.Subject_Adaper;
import com.example.whatsapp.databinding.ActivityAdminBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class Admin extends AppCompatActivity {
FirebaseDatabase database;
ActivityAdminBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding=ActivityAdminBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        database=FirebaseDatabase.getInstance();
        getSupportActionBar().hide();

//
//        binding.SentNoticeButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Admin_model admin_model= new Admin_model(binding.NoticeText.getText().toString());
//                database.getReference().child("Notice").child(s).setValue(admin_model);
//                Toast.makeText(Admin.this, "SET", Toast.LENGTH_SHORT).show();
//                n++;
//            }
//        });

       String batch= binding.BatchNumberEditeText.getText().toString();

       if(batch==null){
           Toast.makeText(Admin.this, "Enter Batch Number...", Toast.LENGTH_SHORT).show();
           return;
       }

       else {
        binding.SeTRoutineBoutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {      String batch=binding.BatchNumberEditeText.getText().toString();
                      Subject_Adaper subject_adaper=new Subject_Adaper(

                        binding.BatchNumberEditeText.getText().toString(),

                              binding.Sat930To1045.getText().toString(),
                              binding.Sat1045To12.getText().toString(),
                              binding.Sat12To115.getText().toString(),
                              binding.Sat0230To345.getText().toString(),
                              binding.Sat345To4.getText().toString(),
                              binding.Sat4To515.getText().toString(),


                              binding.Sun930To1045.getText().toString(),
                              binding.sun1045To12.getText().toString(),
                              binding.Sun12To115.getText().toString(),
                              binding.Sun0230To345.getText().toString(),
                              binding.Sun345To4.getText().toString(),
                              binding.Sun4To515.getText().toString(),




                              binding.Mon930To1045.getText().toString(),
                              binding.Mon1045To12.getText().toString(),
                              binding.Mon12To115.getText().toString(),
                              binding.Mon0230To345.getText().toString(),
                              binding.Mon345To4.getText().toString(),
                              binding.Mon4To515.getText().toString(),


                              binding.Tue0230To345.getText().toString(),
                              binding.Tue1045To12.getText().toString(),
                              binding.Tue12To115.getText().toString(),
                              binding.Tue0230To345.getText().toString(),
                              binding.Tue345To4.getText().toString(),
                              binding.Tue4To515.getText().toString(),



                        binding.Wed930To1045.getText().toString(),
                        binding.Wed1045To12.getText().toString(),
                        binding.Wed12To115.getText().toString(),
                        binding.Wed0230To345.getText().toString(),
                        binding.Wed345To4.getText().toString(),
                              binding.Wed4To515.getText().toString()






                        );
                database.getReference().child("Routine").child(batch).setValue(subject_adaper);
                Toast.makeText(Admin.this, "Data Set", Toast.LENGTH_SHORT).show();
                onBackPressed();
            }
        });



    }}
}