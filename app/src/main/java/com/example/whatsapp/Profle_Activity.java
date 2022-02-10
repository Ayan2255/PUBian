package com.example.whatsapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.whatsapp.Model.user;
import com.example.whatsapp.databinding.ActivityProfleBinding;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.util.Objects;

public class Profle_Activity extends AppCompatActivity {
    ActivityProfleBinding binding;
    FirebaseDatabase database;
    DatabaseReference reference1;
    FirebaseAuth auth;
    FirebaseStorage storage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityProfleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        auth=FirebaseAuth.getInstance();
        database=FirebaseDatabase.getInstance();
        storage=FirebaseStorage.getInstance();
        reference1=database.getReference();


        reference1.child("User").child(auth.getUid()).child("userName").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

               binding.ProfleName.setText(snapshot.getValue().toString());



            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });




        reference1.child("User").child(auth.getUid()).child("proflePic").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
               // Toast.makeText(Profle_Activity.this, snapshot.getValue().toString(), Toast.LENGTH_SHORT).show();
                //binding.profileImage.setImageDrawable((Drawable) snapshot.getValue());
                //Picasso.get().load(String.valueOf(snapshot)).placeholder(R.drawable.ayan).into(binding.profileImage);
                Picasso.get().load((String) snapshot.getValue()).placeholder(R.drawable.p).into(binding.profileImage);

            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });




        binding.BackArrow.setOnClickListener(new View.OnClickListener() {

             @Override
             public void onClick(View v) {
                 onBackPressed();
             }
         });

         binding.set.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent=new Intent();
                 intent.setAction(Intent.ACTION_GET_CONTENT);
                 intent.setType("image/*");
                 startActivityForResult(intent,33);
             }
         });


         binding.save.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {


                 reference1.child("User").child(auth.getUid()).child(auth.getUid()).setValue(binding.ProfileBatch.getText().toString());
                 Toast.makeText(Profle_Activity.this, "Set Batch", Toast.LENGTH_SHORT).show();


             }
         });







        binding.logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auth.signOut();
                Intent intent=new Intent(Profle_Activity.this,Singin.class);
                Toast.makeText(Profle_Activity.this, "Logout", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }

        });


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (data.getData()!=null){
            Uri sfile=data.getData();
            binding.profileImage.setImageURI(sfile);
            final StorageReference reference=storage.getReference().child("proflePic")
                    .child(FirebaseAuth.getInstance().getUid());
            reference.putFile(sfile).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                    Toast.makeText(Profle_Activity.this, "Picture Uploade", Toast.LENGTH_SHORT).show();

                    reference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                        @Override
                        public void onSuccess(Uri uri) {
                            reference1.child("User").child(FirebaseAuth.getInstance().getUid()).child("proflePic")
                                    .setValue(uri.toString());
                        }
                    });
                }
            });

        }
    }



}
