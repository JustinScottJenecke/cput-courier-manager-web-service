package org.api.couriermanager.entity.asset.bridges;

import java.io.Serializable;
import java.util.Objects;

/**==============
 *
 * Description: - Composite key for DeliveryVehicle
 *              - Relationship is 1:m(vehicleID is primary key, 1 Vehicle can perform multiple Deliveries)
 * Author(s): Justin Jenecke
 * Date: 02/12/2020
 *
 ================*/

public class DeliveryVehicleID implements Serializable {

    private String deliveryNo, vehicleID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeliveryVehicleID that = (DeliveryVehicleID) o;
        return deliveryNo.equals(that.deliveryNo) &&
                vehicleID.equals(that.vehicleID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deliveryNo, vehicleID);
    }
}
