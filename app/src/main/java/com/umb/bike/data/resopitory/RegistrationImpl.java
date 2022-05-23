package com.umb.bike.data.resopitory;

import com.umb.bike.data.dao.RegistrationDao;
import com.umb.bike.data.entity.Registration;

import java.util.List;

public class RegistrationImpl implements IRegistration{

    RegistrationDao registrationDao;

    @Override
    public List<Registration> getAll() {
        return registrationDao.getAll();
    }

    @Override
    public Registration findById(String registrationId) {
        return registrationDao.findById(registrationId);
    }

    @Override
    public void update(Registration registration) {
        registrationDao.update(registration);
    }

    @Override
    public void delete(Registration registration) {
        registrationDao.delete(registration);
    }

    @Override
    public void save(Registration registration) {
        registrationDao.save(registration);
    }
}
