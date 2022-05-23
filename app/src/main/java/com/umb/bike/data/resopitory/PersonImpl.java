package com.umb.bike.data.resopitory;

import com.umb.bike.data.dao.PersonDao;
import com.umb.bike.data.entity.Person;

import java.util.List;

public class PersonImpl implements IPerson{

    PersonDao personDao;

    @Override
    public List<Person> getAll() {
        return personDao.getAll();
    }

    @Override
    public Person findById(String vehicleId) {
        return personDao.findById(vehicleId);
    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void delete(Person person) {

    }

    @Override
    public void save(Person person) {

    }
}
