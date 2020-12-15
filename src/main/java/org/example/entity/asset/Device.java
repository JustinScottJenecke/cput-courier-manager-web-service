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
    private String deviceID;

    private String model;
    private String manufacturer;

    private double value;
    private double depreciatedValue;

    protected Device() {
    }
    private Device(Builder b) {
        this.deviceID = b.deviceID;
        this.model = b.model;
        this.manufacturer = b.manufacturer;
        this.value = b.value;
        this.depreciatedValue = b.depreciatedValue;
    }

    public String getDeviceID() {
        return deviceID;
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

    @Override
    public String toString() {
        return "Device{" +
                "ID='" + deviceID + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", value=" + value +
                ", depreciatedValue=" + depreciatedValue +
                '}';
    }

    public static class Builder{

        private String deviceID;
        private String model;
        private String manufacturer;

        private double value;
        private double depreciatedValue;

        public Builder setDeviceID(String deviceID) {
            this.deviceID = deviceID;
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

        public Builder copy(Device d){

            this.deviceID = d.deviceID;
            this.model = d.model;
            this.manufacturer = d.manufacturer;
            this.value = d.value;
            this.depreciatedValue = d.depreciatedValue;

            return this;
        }

        public Device build(){ return new Device(this); }

    }

}
