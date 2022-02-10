package com.example.whatsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.example.whatsapp.Model.bus;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Prothom_alo extends AppCompatActivity {
    private WebView mywebView;
    FirebaseDatabase database;
    DatabaseReference reference;
    bus b;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_prothom_alo);
        database=FirebaseDatabase.getInstance();
        reference=database.getReference("Bus");
      reference.addListenerForSingleValueEvent(new ValueEventListener() {
          @Override
          public void onDataChange(@NonNull DataSnapshot snapshot) {
           //   b.setU(snapshot);
              String s=snapshot.toString();
              mywebView=(WebView) findViewById(R.id.Prothom_Alo_webView);
              mywebView.setWebViewClient(new WebViewClient());
              mywebView.loadUrl(String.valueOf(snapshot));
              WebSettings webSettings=mywebView.getSettings();
              webSettings.setJavaScriptEnabled(true);
              Toast.makeText(Prothom_alo.this, "Show Bus Time", Toast.LENGTH_SHORT).show();
          }

          @Override
          public void onCancelled(@NonNull DatabaseError error) {
              Toast.makeText(Prothom_alo.this, "No Uplod Bus Time", Toast.LENGTH_SHORT).show();

          }
      });





    }
    public class mywebClient extends WebViewClient{
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon){
            super.onPageStarted(view,url,favicon);
        }
        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url){
            view.loadUrl(url);
            return true;
        }
    }
    @Override
    public void onBackPressed(){
        if(mywebView.canGoBack()) {
            mywebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}