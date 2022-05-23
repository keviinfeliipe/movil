package com.umb.bike.data.entity;

import android.graphics.Bitmap;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;


@Entity(tableName = "vehicle"
        /*foreignKeys = {
            @ForeignKey(entity = Person.class, childColumns = "id_person", parentColumns = "id_person")
        }*/)
public class Vehicle {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_vehicle")
    private int vehicleId;
    private String plate;
    @ColumnInfo(name = "id_person", index = true)
    private String personId;
    @ColumnInfo(name = "class")
    private String vehicleClass;
    private String serial;
    private String brand;
    private String color;
    private String photo;

    public Vehicle(String plate, String personId, String vehicleClass, String serial, String brand, String color) {
        this.plate = plate;
        this.personId = personId;
        this.vehicleClass = vehicleClass;
        this.serial = serial;
        this.brand = brand;
        this.color = color;
        this.photo = null;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(String vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Vehicle{");
        sb.append("vehicleId=").append(vehicleId);
        sb.append(", plate='").append(plate).append('\'');
        sb.append(", personId='").append(personId).append('\'');
        sb.append(", vehicleClass='").append(vehicleClass).append('\'');
        sb.append(", serial='").append(serial).append('\'');
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", photo='").append(photo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
