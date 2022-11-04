package com.example.trabajo1ud;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.trabajo1ud.databinding.LvMueblesRowBinding;

import java.util.ArrayList;
import java.util.List;

public class MueblesAdapter extends ArrayAdapter<Muebles> {

    public MueblesAdapter(Context context, int resource, List<Muebles> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int posotion, View convertView, ViewGroup parent){
        Muebles mueble = getItem(posotion);

        LvMueblesRowBinding binding=null;

        if (convertView == null) {
            binding =LvMueblesRowBinding.inflate(LayoutInflater.from(getContext()),parent, false);
            convertView = binding.getRoot();
            convertView.setTag(binding);
        } else {
            binding = (LvMueblesRowBinding) convertView.getTag();
        }
        binding.txtviewNameMuebles.setText(mueble.getNombre());

        Glide.with(getContext()).load(mueble.getUrl()).into(binding.imageMuebles);

        return binding.getRoot();
    }


}
