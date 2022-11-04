package com.example.trabajo1ud;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Muebles.class}, version = 1)
public abstract class MueblesDb extends RoomDatabase {
    /*
    private static MueblesDb INSTANCE;

    public static MueblesDb getDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE =
                    Room.databaseBuilder(
                            context.getApplicationContext(),
                            MueblesDb.class, "db"
                    ).build();
        }
        return INSTANCE;
    }

    public abstract Muebles getMueblesDao();
*/
}
