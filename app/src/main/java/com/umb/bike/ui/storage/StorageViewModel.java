package com.umb.bike.ui.storage;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.umb.bike.data.entity.Vehicle;
import com.umb.bike.data.resopitory.IVehicle;
import com.umb.bike.data.resopitory.VehicleImpl;

import java.util.List;

public class StorageViewModel extends AndroidViewModel {

    private IVehicle iVehicle;
    private LiveData<List<Vehicle>> data;


    public StorageViewModel(Application application) {
        super(application);
        iVehicle = new VehicleImpl(application);
        data = iVehicle.getAll();
    }

    public LiveData<List<Vehicle>> getData() {
        return data;
    }

    public List<Vehicle> getVehicleList(){
        return iVehicle.getAllnew();
    }

    public void deleleAllVehicle(){
        iVehicle.deleteAll();
    }
}
