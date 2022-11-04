package com.example.trabajo1ud;

import android.net.Uri;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

public class MueblesApi {



    ArrayList<Muebles> getMuebles() {

        String BASE_URL = "http://192.168.1.48:3000/api/";
        String url = "http://192.168.1.48:3000/api/muebles";
        Uri.Builder mueblesApi = Uri.parse(BASE_URL).buildUpon().appendPath("muebles");
        try{
            String result= HttpUtils.get(url);



            JSONObject jsonresults = new JSONObject(result);
            JSONArray results = jsonresults.getJSONArray("armarios");

            ArrayList<Muebles> listaMuebles = new ArrayList<>();

            for (int i=0;i<result.length();i++){
                try{
                    JSONObject mueblesJson = results.getJSONObject(i);

                    System.out.println(mueblesJson);

                    Muebles mueble = new Muebles();
                    mueble.setNombre(mueblesJson.getString("nombre"));
                    mueble.setDescripción(mueblesJson.getString("descripcion"));
                    mueble.setUrl(mueblesJson.getString("imagen"));
                    mueble.setAltura(mueblesJson.getInt("altura"));
                    mueble.setAnchura(mueblesJson.getInt("anchura"));
                    listaMuebles.add(mueble);



                }catch (Exception e) {
                    e.printStackTrace();
                }
            }

            return listaMuebles;
        }catch (IOException | JSONException e) {
            e.printStackTrace();

        }

       return null;
    }


    }


