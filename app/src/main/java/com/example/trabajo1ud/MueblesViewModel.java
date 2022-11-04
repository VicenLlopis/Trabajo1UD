/*package com.example.trabajo1ud;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MueblesViewModel extends AndroidViewModel {

    private final Application app;
    private final MueblesDb db;
    private final MueblesDao dao;
    private LiveData<List<Muebles>> muebles;



    public MueblesViewModel(@NonNull Application application){
        super(application);
        this.app=application;
        this.db=MueblesDb.getDatabase(this.app);
        this.dao= (MueblesDao) this.db.getMueblesDao();
    }


    public LiveData<List<Muebles>> getMuebles(){
        return dao.getMuebles();
    }
    public void refresh(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(
                app.getApplicationContext()
        );
        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.execute(() ->{
            MueblesApi api = new MueblesApi();
            ArrayList<Muebles> muebles = api.getMuebles();
            this.dao.deleteMueble();
            this.dao.addMueble(muebles);
        });

    }

}*/
