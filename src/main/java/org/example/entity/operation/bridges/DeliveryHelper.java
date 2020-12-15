package org.example.entity.operation.bridges;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**==============
 *
 * Description: - Bridge Entity for DeliveryHelper
 *              - Relationship is 1:m(deliveryNo is primary key, 1 Delivery can be assisted by multiple Helpers)
 * Author(s): Justin Jenecke
 * Date: 2/12/2020
 *
 ================*/

@Entity
@IdClass(DeliveryHelperID.class)
public class DeliveryHelper {

    @Id
    private String deliveryNo, helperID;

    protected DeliveryHelper(){
    }

    private DeliveryHelper(Builder b) {
        this.deliveryNo = b.deliveryNo;
        this.helperID = b.helperID;
    }

    public String getDeliveryNo() { return deliveryNo; }

    public String getHelperID() { return helperID; }

    public static class Builder{

        private String deliveryNo, helperID;

        public Builder setDeliveryNo(String deliveryNo) {
            this.deliveryNo = deliveryNo;
            return this;
        }

        public Builder setHelperID(String helperID) {
            this.helperID = helperID;
            return this;
        }

        public Builder copy(DeliveryHelper dh){

            this.deliveryNo = dh.deliveryNo;
            this.helperID = dh.helperID;

            return this;
        }

        public DeliveryHelper build(){ return new DeliveryHelper(this); }

    }

}
