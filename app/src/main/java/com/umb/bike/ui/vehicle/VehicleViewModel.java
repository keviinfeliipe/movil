package com.umb.bike.ui.vehicle;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.umb.bike.data.entity.Vehicle;
import com.umb.bike.data.resopitory.IVehicle;
import com.umb.bike.data.resopitory.VehicleImpl;

import java.util.List;

public class VehicleViewModel extends AndroidViewModel {

    private IVehicle iVehicle;

    private final LiveData<String> binding;
    private final LiveData<String> plate;
    private final LiveData<String> personId;
    private final LiveData<String> serial;
    private final LiveData<String> brand;
    private final LiveData<String> color;

    public VehicleViewModel(Application application) {
        super(application);
        iVehicle = new VehicleImpl(application);
        this.binding = new MutableLiveData<>();
        this.plate = new MutableLiveData<>();
        this.personId = new MutableLiveData<>();
        this.serial = new MutableLiveData<>();
        this.brand = new MutableLiveData<>();
        this.color = new MutableLiveData<>();
    }

    public void insert(Vehicle vehicle){
        iVehicle.save(vehicle);
    }



}
