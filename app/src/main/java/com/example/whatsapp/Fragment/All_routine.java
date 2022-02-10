package com.example.whatsapp.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.whatsapp.R;
import com.example.whatsapp.databinding.FragmentAllRoutineBinding;
import com.example.whatsapp.databinding.FragmentDayRoutineBinding;
import com.example.whatsapp.databinding.FragmentPresentRoutineBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Map;


public class All_routine<FragmentAllRoutineBinding> extends Fragment {

com.example.whatsapp.databinding.FragmentAllRoutineBinding binding;
FirebaseDatabase database;
FirebaseAuth auth;
DatabaseReference reference;
      String batch=" ";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        binding= com.example.whatsapp.databinding.FragmentAllRoutineBinding.inflate(inflater, container, false);


        database=FirebaseDatabase.getInstance();
        auth=FirebaseAuth.getInstance();
        reference=database.getReference();


        reference.child("Batch").child(auth.getUid()).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()){
                    batch =snapshot.getValue().toString();

                    reference.child("Routine").child(batch).addValueEventListener(new ValueEventListener() {

                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.exists()){
                                Map map=(Map) snapshot.getValue();
                                String batch= (String) map.get("batch");
                                binding.Sat930To1045.setText(map.get("s1").toString());
                                binding.Sat1045To12.setText(map.get("s2").toString());
                                binding.Sat12To115.setText(map.get("s3").toString());
                                binding.Sun0230To345.setText(map.get("s4").toString());
                                binding.Sat345To4.setText(map.get("s5").toString());
                                binding.Sat4To515.setText(map.get("s6").toString());



                                binding.Sun930To1045.setText(map.get("s7").toString());
                                binding.sun1045To12.setText(map.get("s8").toString());
                                binding.Sun12To115.setText(map.get("s9").toString());
                                binding.Sun0230To345.setText(map.get("s10").toString());
                                binding.Sun345To4.setText(map.get("s11").toString());
                                binding.Sun4To515.setText(map.get("s12").toString());



                                binding.Mon930To1045.setText(map.get("s13").toString());
                                binding.Mon1045To12.setText(map.get("s14").toString());
                                binding.Mon12To115.setText(map.get("s15").toString());
                                binding.Mon0230To345.setText(map.get("s16").toString());
                                binding.Mon345To4.setText(map.get("s17").toString());
                                binding.Mon4To515.setText(map.get("s18").toString());


                                binding.Tue930To1045.setText(map.get("s19").toString());
                                binding.Tue1045To12.setText(map.get("s20").toString());
                                binding.Tue12To115.setText(map.get("s21").toString());
                                binding.Tue0230To345.setText(map.get("s22").toString());
                                binding.Tue345To4.setText(map.get("s23").toString());
                                binding.Tue4To515.setText(map.get("s24").toString());



                                binding.Wed930To1045.setText(map.get("s25").toString());
                                binding.Wed1045To12.setText(map.get("s26").toString());
                                binding.Wed12To115.setText(map.get("s27").toString());
                                binding.Wed0230To345.setText(map.get("s28").toString());
                                binding.Wed345To4.setText(map.get("s29").toString());
                                //binding.Wed4To515.setText(map.get("30").toString());


                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });

                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });



        return binding.getRoot();

    }





}