package org.example.entity.asset;

import javax.persistence.Entity;
import javax.persistence.Id;

/**==============
 *
 * Description:Concrete Entity for Device
 * Author(s): Justin Jenecke
 * Date: 20/11/2020
 *
 ================*/
@Entity
public class Device {

    @Id
    private String ID;

    private String model;
    private String manufacturer;

    private double value;
    private double depreciatedValue;

    private String vehicleID;

    protected Device() {
    }
    public Device(Builder b) {
        this.ID = b.ID;
        this.model = b.model;
        this.manufacturer = b.manufacturer;
        this.value = b.value;
        this.depreciatedValue = b.depreciatedValue;
        this.vehicleID = b.vehicleID;
    }

    public String getID() {
        return ID;
    }

    public String getModel() { return model; }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getValue() {
        return value;
    }

    public double getDepreciatedValue() {
        return depreciatedValue;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    @Override
    public String toString() {
        return "Device{" +
                "ID='" + ID + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", value=" + value +
                ", depreciatedValue=" + depreciatedValue +
                ", vehicleID='" + vehicleID + '\'' +
                '}';
    }

    public static class Builder{

        private String ID;
        private String model;
        private String manufacturer;

        private double value;
        private double depreciatedValue;

        private String vehicleID;

        public Builder setID(String ID) {
            this.ID = ID;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
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

        public Builder setVehicleID(String vehicleID) {
            this.vehicleID = vehicleID;
            return this;
        }

        public Builder copy(Device d){

            this.ID = d.ID;
            this.model = d.model;
            this.manufacturer = d.manufacturer;
            this.value = d.value;
            this.depreciatedValue = d.depreciatedValue;
            this.vehicleID = d.vehicleID;

            return this;
        }

        public Device build(){ return new Device(this); }

    }

}
