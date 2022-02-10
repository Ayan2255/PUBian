package com.example.whatsapp.Fragment;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.whatsapp.R;
import com.example.whatsapp.Routine;
import com.example.whatsapp.Singin;
import com.example.whatsapp.databinding.FragmentPresentRoutineBinding;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Present_routine extends Fragment {
    FragmentPresentRoutineBinding binding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentPresentRoutineBinding.inflate(inflater, container, false);

        Date date = new Date();
        String  s1="Complex Variable And Transfrom Mathematics",
                s2="Digital Logic Design",
                s3="Probability And Statistics",
                s4="Electronic",
                s5="Database Management System",
                s6="Design And Analysis Of Algorithms";
         SimpleDateFormat simpleDateFormat=new SimpleDateFormat("EEE");
         String day= simpleDateFormat.format(date).toString();
        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("hh:mm a");
        SimpleDateFormat simpleDateFormatHoure=new SimpleDateFormat("HH");
        SimpleDateFormat simpleDateFormatMinute=new SimpleDateFormat("mm");


        LocalTime time00_01= LocalTime.parse("00:01");
        LocalTime time9_30= LocalTime.parse("09:29");
        LocalTime time10_45= LocalTime.parse("10:44");
        LocalTime time12= LocalTime.parse("11:59");
        LocalTime time1_15= LocalTime.parse("13:14");
        LocalTime time2_30= LocalTime.parse("14:29");
        LocalTime time3_45= LocalTime.parse("15:44");
        LocalTime time4_30= LocalTime.parse("16:29");
        LocalTime time_5_15= LocalTime.parse("17:14");



        LocalTime now =LocalTime.now();
       //LocalDateTime localDateTime=LocalDateTime.of();


        String timeHoure= simpleDateFormatHoure.format(date).toString();
        String timeMinute= simpleDateFormatMinute.format(date).toString();



        binding.TimeText.setText(simpleDateFormat1.format(date).toString());




        switch (day){

            case "Sat": {
                if (now.isAfter(time00_01)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");

                }
                if (now.isAfter(time9_30)) {
                    binding.subSet.setText(s2);
                    binding.TimeSet.setText("09:30 to 10:45");

                }
                if (now.isAfter(time10_45)) {
                    binding.subSet.setText(s1);
                    binding.TimeSet.setText("10:45 to 12:00");

                }
                if (now.isAfter(time12)) {
                    binding.subSet.setText(s5);
                    binding.TimeSet.setText("12:00 to 01:15");

                }
                if (now.isAfter(time1_15)) {
                    binding.subSet.setText("--No Class--");
                    binding.subSet.setText("--No Class--");

                }
                if (now.isAfter(time2_30)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");
                }
                if (now.isAfter(time3_45)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");
                }
                if (now.isAfter(time4_30)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");
                }
                if (now.isAfter(time_5_15)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");
                }

            }
                break;

            case "Sun":


            {
                if (now.isAfter(time00_01)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");

                }
                if (now.isAfter(time9_30)) {
                    binding.subSet.setText(s4);
                    binding.TimeSet.setText("09:30 to 10:45");

                }
                if (now.isAfter(time10_45)) {
                    binding.subSet.setText(s1);
                    binding.TimeSet.setText("10:45 to 12:00");

                }
                if (now.isAfter(time12)) {
                    binding.subSet.setText(s3);
                    binding.TimeSet.setText("12:00 to 01:15");

                }
                if (now.isAfter(time1_15)) {
                    binding.subSet.setText("--No Class--");
                    binding.subSet.setText("--No Class--");

                }
                if (now.isAfter(time2_30)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");
                }
                if (now.isAfter(time3_45)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");
                }
                if (now.isAfter(time4_30)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");
                }
                if (now.isAfter(time_5_15)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");
                }

            }
                break;
            case "Mon":
            {
                if (now.isAfter(time00_01)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");

                }
                if (now.isAfter(time9_30)) {
                    binding.subSet.setText(s2);
                    binding.TimeSet.setText("09:30 to 10:45");

                }
                if (now.isAfter(time10_45)) {
                    binding.subSet.setText(s6);
                    binding.TimeSet.setText("10:45 to 12:00");

                }
                if (now.isAfter(time12)) {
                    binding.subSet.setText(s6);
                    binding.TimeSet.setText("12:00 to 01:15");

                }
                if (now.isAfter(time1_15)) {
                    binding.subSet.setText("--No Class--");
                    binding.subSet.setText("--No Class--");

                }
                if (now.isAfter(time2_30)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");
                }
                if (now.isAfter(time3_45)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");
                }
                if (now.isAfter(time4_30)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");
                }
                if (now.isAfter(time_5_15)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");
                }

            }
            case "Wed":{
                if (now.isAfter(time00_01)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");

                }
                if (now.isAfter(time9_30)) {
                    binding.subSet.setText(s4);
                    binding.TimeSet.setText("09:30 to 10:45");

                }
                if (now.isAfter(time10_45)) {
                    binding.subSet.setText(s3);
                    binding.TimeSet.setText("10:45 to 12:00");

                }
                if (now.isAfter(time12)) {
                    binding.subSet.setText(s5);
                    binding.TimeSet.setText("12:00 to 01:15");

                }
                if (now.isAfter(time1_15)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");

                }
                if (now.isAfter(time2_30)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");
                }
                if (now.isAfter(time3_45)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");
                }
                if (now.isAfter(time4_30)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");
                }
                if (now.isAfter(time_5_15)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");
                }

            }

                break;
            case "Tue":
            {
                if (now.isAfter(time00_01)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");

                }
                if (now.isAfter(time9_30)) {
                    binding.subSet.setText(s4);
                    binding.TimeSet.setText("09:30 to 10:45");

                }
                if (now.isAfter(time10_45)) {
                    binding.subSet.setText(s4);
                    binding.TimeSet.setText("10:45 to 12:00");

                }
                if (now.isAfter(time12)) {
                    binding.subSet.setText(s4);
                    binding.TimeSet.setText("12:00 to 01:15");

                }
                if (now.isAfter(time1_15)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");

                }
                if (now.isAfter(time2_30)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");
                }
                if (now.isAfter(time3_45)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");
                }
                if (now.isAfter(time4_30)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");
                }
                if (now.isAfter(time_5_15)) {
                    binding.subSet.setText("--No Class--");
                    binding.TimeSet.setText("--No Class--");
                }

            }
            case "Thu":{
                binding.subSet.setText("--No Class--");
                binding.TimeSet.setText("--No Class--");}
            case "Fri":{
                binding.subSet.setText("--No Class--");
                binding.TimeSet.setText("--No Class--");
            }
            default:
                //   textView.setText("abc");
                break;


        }
       /* if (now.isBefore(time)){
            binding.subSet.setText("Ayan");
            Toast.makeText(getActivity(), "hiiiiiiiiii", Toast.LENGTH_SHORT).show();
        }*/





     /*   if(simpleDateFormatHoure.format(date).n ){
            binding.subSet.setText(s2);
            binding.TimeSet.setText("9:30 to 10:45");        }*/
     /*   switch(day) {

            case "Fri": {

                switch (timeHoure){
                    case "9":{
                        switch (timeMinute){
                            case "26":{
                                binding.subSet.setText(s1);
                                binding.TimeSet.setText("9:30 to 10:45");
                            }

                        }
                    }}
            }}
*/

        /*
        if(day=="Sat" && timeHoure=="10" && timeMinute=="45"){
            binding.subSet.setText(s1);
            binding.TimeSet.setText("10:45 to 12.00");
        }

        if(day=="SAt" && timeHoure=="12" && timeMinute=="00" ){
            binding.subSet.setText(s5);
            binding.TimeSet.setText("9:30 to 10:45");
        }



        if(day=="Sun" && timeHoure=="9" && timeMinute=="30"  ){
            binding.subSet.setText(s4);
            binding.TimeSet.setText("9:30 to 10:45");
        }
        if(day=="Sun" && timeHoure=="10" && timeMinute=="45" ){
            binding.subSet.setText(s1);
            binding.TimeSet.setText("10:45 to 12.00");
        }
        if(day=="Sun" && timeHoure=="12" && timeMinute=="00"  ){
            binding.subSet.setText(s3);
            binding.TimeSet.setText("9:30 to 10:45");}

            if(day=="Mon" && timeHoure=="9" && timeMinute=="30"  ){
                binding.subSet.setText(s2);
                binding.TimeSet.setText("9:30 to 10:45");
            }
            if(day=="Mon" && timeHoure=="10" && timeMinute=="45"  ){
                binding.subSet.setText(s6);
                binding.TimeSet.setText("10:45 to 12.00");
            }

            if(day=="Mon" && timeHoure=="12" && timeMinute=="00" ) {
                binding.subSet.setText(s6);
                binding.TimeSet.setText("9:30 to 10:45");
            }
           if(day=="Tue" && timeHoure=="9" && timeMinute=="30"  ){
            binding.subSet.setText(s4);
            binding.TimeSet.setText("9:30 to 10:45");
           }
        if(day=="Tue" && timeHoure=="10" && timeMinute=="45"  ){
            binding.subSet.setText(s3);
            binding.TimeSet.setText("10:45 to 12.00");
        }

        if(day=="Tue" && timeHoure=="12" && timeMinute=="00"  ) {
            binding.subSet.setText(s5);
            binding.TimeSet.setText("9:30 to 10:45");
        }
        if(day=="Wed" && timeHoure=="10" && timeMinute=="45" ){
            binding.subSet.setText(s4);
            binding.TimeSet.setText("10:45 to 12.00");
        }
        if( timeHoure=="1" && timeMinute=="21"  ){
            binding.subSet.setText("---No Class---");
            binding.TimeSet.setText("---No Class---");
        }

        switch(day) {

            case "Fri": {

                switch (timeHoure){
                    case "9":{
                        switch (timeMinute){
                            case "25":
                            case "26":{
                                //binding.subSet.setText(s1);
                                //binding.TimeSet.setText("9:30 to 10:45");
                            }

                        }
                }}
            }}

*/

        return binding.getRoot();
    }}