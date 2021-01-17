package org.api.couriermanager.factory.operation;

import org.api.couriermanager.entity.operation.Delivery;

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
                                          //int distance,
                                          int stops){

        Delivery delivery = new Delivery.Builder()
                .setDeliveryNo(deliveryNo)
                .setRoute(route)
                //.setDistance(distance)
                .setStops(stops)
                .build();

        return delivery;
    }

}
