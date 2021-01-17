package org.api.couriermanager.entity.asset;

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
    private String vehicleID;

    private String vehicleCode;
    private int vehicleKm;

    private double value;
    private double depreciatedValue;

    protected Vehicle() {
    }

    private Vehicle(Builder b) {

        this.vehicleID = b.vehicleID;
        this.vehicleCode = b.vehicleCode;
        this.vehicleKm = b.vehicleKm;
        this.value = b.value;
        this.depreciatedValue = b.depreciatedValue;
    }

    public String getVehicleID() {
        return vehicleID;
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

    @Override
    public String toString() {
        return "Vehicle{" +
                "ID='" + vehicleID + '\'' +
                ", vehicleCode='" + vehicleCode + '\'' +
                ", vehicleKm=" + vehicleKm +
                ", value=" + value +
                ", depreciatedValue=" + depreciatedValue +
                '}';
    }

    // ------  public static inner class  ------
    public static class Builder{

        private String vehicleID;
        private String vehicleCode;
        private int vehicleKm;
        private double value;
        private double depreciatedValue;

        public Builder setVehicleID(String vehicleID) {
            this.vehicleID = vehicleID;
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

        public Builder copy(Vehicle v) {

            this.vehicleID = v.vehicleID;
            this.vehicleCode = v.vehicleCode;
            this.vehicleKm = v.vehicleKm;
            this.value = v.value;
            this.depreciatedValue = v.depreciatedValue;

            return this;

        }

        public  Vehicle build(){

            return new Vehicle(this);
        }

    }

}
