package com.umb.bike.data.resopitory;

import com.umb.bike.data.entity.Person;

import java.util.List;

public interface IPerson {
    List<Person> getAll();
    Person findById(String personId);
    void update(Person person);
    void delete(Person person);
    void save(Person person);
}
