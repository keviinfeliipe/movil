package com.umb.bike.data.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "registration")
public class Registration {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "id_registration")
    private String registrationId;
    private String plate;
    private String denunciation;
    private String insurance;
    private String prosecution;
    private String court;
    private String date;
    private String observation;

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getDenunciation() {
        return denunciation;
    }

    public void setDenunciation(String denunciation) {
        this.denunciation = denunciation;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getProsecution() {
        return prosecution;
    }

    public void setProsecution(String prosecution) {
        this.prosecution = prosecution;
    }

    public String getCourt() {
        return court;
    }

    public void setCourt(String court) {
        this.court = court;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }
}
