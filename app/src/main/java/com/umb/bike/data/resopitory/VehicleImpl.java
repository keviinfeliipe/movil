package com.umb.bike.data.resopitory;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.umb.bike.data.AppDatabase;
import com.umb.bike.data.dao.VehicleDao;
import com.umb.bike.data.entity.Vehicle;

import java.util.List;

public class VehicleImpl implements IVehicle{

    private VehicleDao vehicleDao;
    private LiveData<List<Vehicle>> data;

    public VehicleImpl(Application application) {
        AppDatabase db = AppDatabase.getDataBase(application);
        this.vehicleDao = db.vehicleDao();
        data = vehicleDao.getAll();
    }

    @Override
    public LiveData<List<Vehicle>> getAll() {
        return data;
    }

    @Override
    public List<Vehicle> getAllnew() {
        return vehicleDao.getAllNew();
    }

    @Override
    public Vehicle findById(String vehicleId) {
        return null;
    }

    @Override
    public void update(Vehicle vehicle) {
        vehicleDao.update(vehicle);
    }

    @Override
    public void delete(Vehicle vehicle) {
        vehicleDao.delete(vehicle);
    }

    @Override
    public void save(Vehicle vehicle) {
        AppDatabase.databaseWriteExecutor.execute(()->{
            vehicleDao.save(vehicle);
        });
    }

    @Override
    public void deleteAll() {
        vehicleDao.deleteAll();
    }


}
