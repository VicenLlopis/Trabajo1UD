package com.example.trabajo1ud;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.bumptech.glide.Glide;
import com.example.trabajo1ud.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);

        View view= binding.getRoot();

        Bundle args = getArguments();

        if(args != null){
            Muebles mueble = (Muebles) args.getSerializable("item");

            if(mueble != null){
               update(mueble);

            }

        }
        return view;
    }

    private void update(Muebles mueble) {
        Log.d("MOVIE", mueble.toString());

        binding.txtSeconFragName.setText("Nombre del armario: \n\n"+mueble.getNombre());
        binding.txtDescripcion.setText("Descripción: \n"+mueble.getDescripción());
        binding.txtAltura.setText("Altura: "+mueble.getAltura());
        binding.txtAnchura.setText("Anchura: "+mueble.getAnchura());

        Glide.with(getContext()).load(mueble.getUrl()).into(binding.imageViewSegFrag);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        /*binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });*/
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}