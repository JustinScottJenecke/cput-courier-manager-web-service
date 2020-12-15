package org.example.entity.asset.bridges;
/**==============
 *
 * Description: - Bridge Entity for VehicleDevice
 *              - Relationship is 1:1, with vehicleID as primary key
 * Author(s): Yaseen Levy
 * Date: 20/11/2020
 *
 ================*/
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VehicleDevice {

    @Id
    private String vehicleID;
    private String deviceID;

    protected VehicleDevice() {
    }

    private VehicleDevice(Builder b) {
        this.deviceID = b.deviceID;
        this.vehicleID = b.vehicleID;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public String getVehicleID() { return vehicleID; }

    public static class Builder{
        private String deviceID;
        private String vehicleID;

        public Builder setDeviceID(String deviceID) {
            this.deviceID = deviceID;
        return this;}

        public Builder setVehicleID(String vehicleID) {
            this.vehicleID = vehicleID;
        return this;}

        public Builder copy(VehicleDevice vd){
            this.deviceID = vd.deviceID;
            this.vehicleID = vd.vehicleID;
            return this;
        }

        public VehicleDevice build(){
            return new VehicleDevice(this);
        }
    }

    @Override
    public String toString() {
        return "VehicleDevice{" +
                "vehicleID='" + vehicleID + '\'' +
                ", deviceID='" + deviceID + '\'' +
                '}';
    }
}
