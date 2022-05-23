package com.umb.bike.data.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.umb.bike.data.entity.Person;

import java.util.List;

@Dao
public interface PersonDao {

    @Query("SELECT * FROM person")
    List<Person> getAll();

    @Query("SELECT * FROM person WHERE id_person=:idPerson")
    Person findById(String idPerson);

    @Insert
    void save(Person person);

    @Delete
    void delete(Person person);

    @Update
    void update(Person person);

}
