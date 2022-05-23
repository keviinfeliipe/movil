package com.umb.bike.data;

import static com.umb.bike.utilities.Constants.DATABASE_NAME;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.umb.bike.data.dao.PersonDao;
import com.umb.bike.data.dao.RegistrationDao;
import com.umb.bike.data.dao.VehicleDao;
import com.umb.bike.data.entity.Person;
import com.umb.bike.data.entity.Registration;
import com.umb.bike.data.entity.Vehicle;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Vehicle.class, Person.class, Registration.class}, version = 1, exportSchema = false)
@TypeConverters(Converters.class)
public abstract class AppDatabase extends RoomDatabase {

    public abstract VehicleDao vehicleDao();
    public abstract PersonDao personDao();
    public abstract RegistrationDao registrationDao();

    private static volatile AppDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    public static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public static AppDatabase getDataBase(Context context){

        if (INSTANCE == null){
            synchronized (AppDatabase.class){
                if (INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase.class, DATABASE_NAME)
                            .addCallback(sRoomDatabaseCallback)
                            .allowMainThreadQueries()
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);

            databaseWriteExecutor.execute(() -> {
                // Populate the database in the background.
                // If you want to start with more words, just add them.
                VehicleDao dao = INSTANCE.vehicleDao();
                dao.save(new Vehicle(
                        "qjb76f",
                        "1024561584",
                        "MOTO",
                        "SERIE1",
                        "DUKE 200",
                        "BLANCO"
                ));
            });
        }
    };

}
