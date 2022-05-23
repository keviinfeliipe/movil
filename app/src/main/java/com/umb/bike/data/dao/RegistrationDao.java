package com.umb.bike.data.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.umb.bike.data.entity.Registration;

import java.util.List;

@Dao
public interface RegistrationDao {

    @Query("SELECT * FROM registration")
    List<Registration> getAll();

    @Query("SELECT * FROM registration WHERE id_registration=:idRegistration")
    Registration findById(String idRegistration);

    @Insert
    void save(Registration registration);

    @Delete
    void delete(Registration registration);

    @Update
    void update(Registration registration);

}
