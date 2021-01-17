package org.api.couriermanager.entity.asset.bridges;
/**==============
 *
 * Description: - Bridge Entity for DeliveryVehicle
 *              - Relationship is 1:m(vehicleID is primary key, 1 Vehicle can perform multiple Deliveries)
 * Author(s): Yaseen Levy
 * Date: 20/11/2020
 *
 ================*/

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(DeliveryVehicleID.class)
public class DeliveryVehicle {

    @Id
    private String deliveryNo, vehicleID;

    protected DeliveryVehicle() {
    }

    private DeliveryVehicle(Builder b) {
        this.deliveryNo = b.deliveryNo;
        this.vehicleID = b.vehicleID;
    }

    public String getDeliveryNo() {
        return deliveryNo;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    @Override
    public String toString() {
        return "DeliveryVehicle{" +
                "deliveryNo='" + deliveryNo + '\'' +
                ", ID='" + vehicleID + '\'' +
                '}';
    }


    public static class Builder{
        private String deliveryNo, vehicleID;

        public Builder setDeliveryNo(String deliveryNo) {
            this.deliveryNo = deliveryNo;
        return this;}

        public Builder setVehicleID(String vehicleID) {
            this.vehicleID = vehicleID;
        return this;}

        public Builder copy(DeliveryVehicle dv){
            this.deliveryNo = dv.deliveryNo;
            this.vehicleID = dv.vehicleID;
        return this;}

        public DeliveryVehicle build(){
            return new DeliveryVehicle(this);
        }
    }

}
