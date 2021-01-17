package org.api.couriermanager.entity.employee.bridges;

import java.io.Serializable;
import java.util.Objects;

/**==============
 *
 * Description: - Composite key for DeliveryDriver
 *  *           - Relationship is 1:m(vehicleID is primary key, 1 Driver can perform multiple Deliveries)
 * Author(s): Justin Jenecke
 * Date: 02/12/2020
 *
 ================*/

public class DeliveryDriverID implements Serializable {

    private String deliveryNo,driverID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeliveryDriverID that = (DeliveryDriverID) o;
        return deliveryNo.equals(that.deliveryNo) &&
                driverID.equals(that.driverID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deliveryNo, driverID);
    }
}
