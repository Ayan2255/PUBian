package com.example.whatsapp.Model;

import android.net.Uri;

import com.google.firebase.database.DataSnapshot;


public class bus {
Uri u;
bus(){}

    public bus(Uri u) {
        this.u = u;
    }

    public Uri getU() {
        return u;
    }

    public void setU(Uri u) {
        this.u = u;
    }
}
