package com.umb.bike.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.umb.bike.data.entity.Vehicle;

import java.util.List;

@Dao
public interface VehicleDao {

    @Query("SELECT * FROM vehicle")
    LiveData<List<Vehicle>> getAll();

    @Query("SELECT * FROM vehicle")
    List<Vehicle> getAllNew();

    @Query("DELETE  FROM vehicle")
    void deleteAll();

    @Query("SELECT * FROM vehicle WHERE id_vehicle=:idVehicle")
    Vehicle findById(String idVehicle);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void save(Vehicle vehicle);

    @Delete
    void delete(Vehicle vehicle);

    @Update
    void update(Vehicle vehicle);

}
