package org.example.entity.employee.bridges;
/**==============
 *
 * Description: - Bridge Entity for DeliveryDriver
 *  *           - Relationship is 1:m(vehicleID is primary key, 1 Driver can perform multiple Deliveries)
 * Author(s): Yaseen Levy
 * Date: 20/11/2020
 *
 ================*/

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(DeliveryDriverID.class)
public class DeliveryDriver {

    @Id
    private String deliveryNo,driverID;

    protected DeliveryDriver() {
    }

    private DeliveryDriver(Builder b) {
        this.deliveryNo = b.deliveryNo;
        this.driverID = b.driverID;
    }

    public String getDeliveryNo() {
        return deliveryNo;
    }

    public String getDriverID() {
        return driverID;
    }


    public static class Builder{
        private String deliveryNo,driverID;

        public Builder setDeliveryNo(String deliveryNo) {
            this.deliveryNo = deliveryNo;
        return this;}

        public Builder setDriverID(String driverID) {
            this.driverID = driverID;
        return this;}

        public Builder copy(DeliveryDriver dd){
            this.deliveryNo = dd.deliveryNo;
            this.driverID = dd.driverID;

        return this;}

        public DeliveryDriver build(){
            return new DeliveryDriver(this);
        }

    }

    @Override
    public String toString() {
        return "DeliveryDriver{" +
                "deliveryNo='" + deliveryNo + '\'' +
                ", driverID='" + driverID + '\'' +
                '}';
    }
}
