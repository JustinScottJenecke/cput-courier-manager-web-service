package org.api.couriermanager.entity.operation.bridges;

import java.io.Serializable;
import java.util.Objects;

/**==============
 *
 * Description: - Composite key for DeliveryHelper
 *              - Relationship is 1:m(deliveryNo is primary key, 1 Delivery can be assisted by multiple Helpers)
 * Author(s): Justin Jenecke
 * Date: 2/12/2020
 *
 ================*/

public class DeliveryHelperID implements Serializable {

    private String deliveryNo, helperID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeliveryHelperID that = (DeliveryHelperID) o;
        return deliveryNo.equals(that.deliveryNo) &&
                helperID.equals(that.helperID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deliveryNo, helperID);
    }
}
