package org.example.entity.asset;

import javax.persistence.Entity;
import javax.persistence.Id;

/**==============
 *
 * Description:Concrete Entity for Vehicle
 * Author(s): Justin Jenecke,
 * Date: 20/11/2020
 *
 ================*/
@Entity
public class Vehicle {

    @Id
    private String ID;

    private String vehicleCode;
    private int vehicleKm;

    private double value;
    private double depreciatedValue;

    private String deviceID;

    protected Vehicle() {
    }

    public Vehicle(Builder b) {

        this.ID = b.ID;
        this.vehicleCode = b.vehicleCode;
        this.vehicleKm = b.vehicleKm;
        this.value = b.value;
        this.depreciatedValue = b.depreciatedValue;
        this.deviceID = b.deviceID;
    }

    public String getID() {
        return ID;
    }

    public String getVehicleCode() {
        return vehicleCode;
    }

    public int getVehicleKm() {
        return vehicleKm;
    }

    public double getValue() {
        return value;
    }

    public double getDepreciatedValue() {
        return depreciatedValue;
    }

    public String getDeviceID() {
        return deviceID;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "ID='" + ID + '\'' +
                ", vehicleCode='" + vehicleCode + '\'' +
                ", vehicleKm=" + vehicleKm +
                ", value=" + value +
                ", depreciatedValue=" + depreciatedValue +
                ", deviceID='" + deviceID + '\'' +
                '}';
    }

    // ------  public static inner class  ------
    public static class Builder{

        private String ID;
        private String vehicleCode;
        private int vehicleKm;
        private double value;
        private double depreciatedValue;
        private String deviceID;

        public Builder setID(String ID) {
            this.ID = ID;
            return this;
        }

        public Builder setVehicleCode(String vehicleCode) {
            this.vehicleCode = vehicleCode;
            return this;
        }

        public Builder setVehicleKm(int vehicleKm) {
            this.vehicleKm = vehicleKm;
            return this;
        }

        public Builder setValue(double value) {
            this.value = value;
            return this;
        }

        public Builder setDepreciatedValue(double depreciatedValue) {
            this.depreciatedValue = depreciatedValue;
            return this;
        }

        public Builder setDeviceID(String deviceID) {
            this.deviceID = deviceID;
            return this;
        }

        public Builder copy(Vehicle v) {

            this.ID = v.ID;
            this.vehicleCode = v.vehicleCode;
            this.vehicleKm = v.vehicleKm;
            this.value = v.value;
            this.depreciatedValue = v.depreciatedValue;
            this.deviceID = v.deviceID;

            return this;

        }

        public  Vehicle build(){

            return new Vehicle(this);
        }

    }

}
