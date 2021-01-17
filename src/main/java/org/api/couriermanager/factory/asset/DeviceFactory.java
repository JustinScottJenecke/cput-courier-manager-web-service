package org.api.couriermanager.factory.asset;

import org.api.couriermanager.entity.asset.Device;

/**==============
 *
 * Description: Factory class for creating a device
 * Author(s): Justin Jenecke
 * Date: 24/11/2020
 *
 ================*/

public class DeviceFactory {

    public static Device createDevice(String deviceID,
                                        String model,
                                        String manufacturer,
                                        double value,
                                        double depreciatedValue){

        Device device = new Device.Builder()
                .setDeviceID(deviceID)
                .setModel(model)
                .setManufacturer(manufacturer)
                .setValue(value)
                .setDepreciatedValue(depreciatedValue)
                .build();

        return device;
    }
}
