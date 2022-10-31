package com.example.trabajo1ud;

import android.net.Uri;

import java.util.ArrayList;

public class MueblesApi {

    ArrayList<Muebles> getMuebles() {
        String BASE_URL = "localhost:3000";
        String url = "localhost:3000/api/muebles";

        Uri.Builder mueblesApi = Uri.parse(BASE_URL).buildUpon().appendPath("muebles");

        return null;
    }
}
