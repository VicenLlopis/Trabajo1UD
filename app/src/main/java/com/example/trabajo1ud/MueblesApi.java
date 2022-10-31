package com.example.trabajo1ud;

import android.net.Uri;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class MueblesApi {
    String BASE_URL = "localhost:3000";
    String url = "localhost:3000/api/muebles";

    ArrayList<Muebles> getMuebles() {
        Uri.Builder mueblesApi = Uri.parse(BASE_URL).buildUpon().appendPath("muebles");
        try{
            String result= HttpUtils.get(url);
            JSONObject jsonResult = new JSONObject();
            JSONArray resultados = new JSONArray(result);

            ArrayList<Muebles> listaMuebles = new ArrayList<>();

            for (int i=0;i<result.length();i++){
                try{
                    JSONObject mueblesJson = resultados.getJSONObject(i);

                    Muebles mueble = new Muebles();

                    mueble.setNombre(mueblesJson.getString("nombre"));
                    mueble.setDescripción(mueblesJson.getString("descripcion"));
                    mueble.setUrl(mueblesJson.getString("url"));
                    listaMuebles.add(mueble);


                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            return listaMuebles;
        }catch (Exception e){
            e.printStackTrace();
        }
       return null;
    }


    }


