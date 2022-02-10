package com.example.whatsapp.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.whatsapp.R;
import com.example.whatsapp.databinding.FragmentDayRoutineBinding;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Day_routine extends Fragment {
   FragmentDayRoutineBinding binding;

   TextView sub1,sub2,sub3;
    String  s1="Complex Variable And Transfrom Mathematics",
            s2="Digital Logic Design",
            s3="Probability And Statistics",
            s4="Electronic",
            s5="Database Management System",
            s6="design And Analysis Of Algorithms";






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentDayRoutineBinding.inflate(inflater, container, false);
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("EEE");
        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("EEE");

        binding.DayText.setText(simpleDateFormat1.format(date).toString());


        switch (simpleDateFormat.format(date)){

            case "Sat":
                binding.fristSubject.setText(s2);
                binding.fristSubject.setText(s1);
                binding.fristSubject.setText(s5);

                break;
            case "Sun":

                binding.fristSubject.setText(s4);
                binding.sdSubject.setText(s1);
                binding.trdSubject.setText(s3);
                break;
            case "Mon":
                binding.fristSubject.setText(s2);
                binding.sdSubject.setText(s6);
                binding.trdSubject.setText(s6);
                break;
            case "Wed":
                binding.fristSubject.setText(s4);
                binding.sdSubject.setText(s3);
                binding.trdSubject.setText(s5);

                break;
            case "Tue":
                binding.fristSubject.setText("------");
                binding.sdSubject.setText(s4);
                binding.trdSubject.setText("------");
                break;
            case "Thu":
                binding.fristSubject.setText("Holyday");
                binding.sdSubject.setText("Holyday");
                binding.trdSubject.setText("Holyday");
                break;
            case "Fri":
                binding.fristSubject.setText("Holyday");
                binding.sdSubject.setText("Holyday");
                binding.trdSubject.setText("Holyday");
                break;
            default:
                //   textView.setText("abc");
                break;


        }






        return binding.getRoot();
    }
}