package org.api.couriermanager.factory.asset;

import org.api.couriermanager.entity.asset.Vehicle;

/**==============
 *
 * Description: Factory class for creating a vehicle
 * Author(s): Justin Jenecke
 * Date: 24/11/2020
 *
 ================*/

public class VehicleFactory {

    public static Vehicle createVehicle(String vehicleID,
                                        String vehicleCode,
                                        int vehicleKm,
                                        double value,
                                        double depreciatedValue){

        Vehicle vehicle = new Vehicle.Builder()
                .setVehicleID(vehicleID)
                .setVehicleCode(vehicleCode)
                .setVehicleKm(vehicleKm)
                .setValue(value)
                .setDepreciatedValue(depreciatedValue)
                .build();

        return vehicle;
    }

}
