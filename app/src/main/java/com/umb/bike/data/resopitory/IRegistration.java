package com.umb.bike.data.resopitory;

import com.umb.bike.data.entity.Registration;

import java.util.List;

public interface IRegistration {
    List<Registration> getAll();
    Registration findById(String registrationId);
    void update(Registration registration);
    void delete(Registration registration);
    void save(Registration registration);
}
