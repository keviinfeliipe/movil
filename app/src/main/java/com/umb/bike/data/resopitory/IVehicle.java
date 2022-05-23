package com.umb.bike.data.resopitory;

import androidx.lifecycle.LiveData;

import com.umb.bike.data.entity.Vehicle;

import java.util.List;

public interface IVehicle {
    LiveData<List<Vehicle>> getAll();
    List<Vehicle> getAllnew();
    Vehicle findById(String vehicleId);
    void update(Vehicle vehicle);
    void delete(Vehicle vehicle);
    void save(Vehicle vehicle);
    void deleteAll();
}
