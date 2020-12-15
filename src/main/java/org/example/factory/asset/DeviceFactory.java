package org.example.factory.asset;

import org.example.entity.asset.Device;

/**==============
 *
 * Description: Factory class for creating a device
 * Author(s): Justin Jenecke
 * Date: 24/11/2020
 *
 ================*/

public class DeviceFactory {

    public static Device createDevice(String ID,
                                        String model,
                                        String manufacturer,
                                        double value,
                                        double depreciatedValue,
                                        String vehicleID){

        Device device = new Device.Builder()
                .setID(ID)
                .setModel(model)
                .setManufacturer(manufacturer)
                .setValue(value)
                .setDepreciatedValue(depreciatedValue)
                .setVehicleID(vehicleID)
                .build();

        return device;
    }

}
