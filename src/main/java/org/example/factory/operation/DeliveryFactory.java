package org.example.factory.operation;

import org.example.entity.operation.Delivery;

/**==============
 *
 * Description: Factory class for creating a delivery
 * Author(s): Yaseen Levy
 * Date: 24/11/2020
 *
 ================*/

public class DeliveryFactory {

    public static Delivery createDelivery(String deliveryNo,
                                          String route,
                                          int distance,
                                          int stops,
                                          String driverID,
                                          String helperID,
                                          String vehicleID){

        Delivery delivery = new Delivery.Builder()
                .setDeliveryNo(deliveryNo)
                .setRoute(route)
                .setDistance(distance)
                .setStops(stops)
                .setDriverID(driverID)
                .setHelperID(helperID)
                .setVehicleID(vehicleID)
                .build();

        return delivery;
    }

}
