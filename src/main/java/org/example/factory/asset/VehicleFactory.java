package org.example.factory.asset;

import org.example.entity.asset.Vehicle;

/**==============
 *
 * Description: Factory class for creating a vehicle
 * Author(s): Justin Jenecke
 * Date: 24/11/2020
 *
 ================*/

public class VehicleFactory {

    public static Vehicle createVehicle(String ID,
                                        String vehicleCode,
                                        int vehicleKm,
                                        double value,
                                        double depreciatedValue,
                                        String deviceID){

        Vehicle vehicle = new Vehicle.Builder()
                .setID(ID)
                .setVehicleCode(vehicleCode)
                .setVehicleKm(vehicleKm)
                .setValue(value)
                .setDepreciatedValue(depreciatedValue)
                .setDeviceID(deviceID)
                .build();

        return vehicle;
    }

}
