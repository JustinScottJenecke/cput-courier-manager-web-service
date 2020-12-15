package org.example.entity.operation;

import javax.persistence.Entity;
import javax.persistence.Id;

/**==============
 *
 * Description:Concrete Entity for Delivery
 * Author(s): Justin Jenecke, Yaseen Levy
 * Date: 20/11/2020
 *
 ================*/

@Entity
public class Delivery {

    @Id
    private String deliveryNo;

    private String route;
    private int distance;
    private int stops;;

    protected Delivery() {
    }

    private Delivery(Builder b) {
        this.deliveryNo = b.deliveryNo;
        this.route = b.route;
        //this.distance = b.distance;
        this.stops = b.stops;

    }

    public String getDeliveryNo() {
        return deliveryNo;
    }

    public String getRoute() {
        return route;
    }

    /*public int getDistance() {
        return distance;
    }*/

    public int getStops() {
        return stops;
    }

    public static class Builder{

        private String deliveryNo;
        private String route;
        //private int distance;
        private int stops;

        public Builder setDeliveryNo(String deliveryNo) {
            this.deliveryNo = deliveryNo;
            return this;
        }

        public Builder setRoute(String route) {
            this.route = route;
            return this;
        }

       /* public Builder setDistance(int distance) {
            this.distance = distance;
            return this;
        }*/

        public Builder setStops(int stops) {
            this.stops = stops;
            return this;
        }

        public Builder copy(Delivery d){

            this.deliveryNo = d.deliveryNo;
            this.route = d.route;
            //this.distance = d.distance;
            this.stops = d.stops;

            return this;
        }

        public Delivery build(){ return new Delivery(this); }

    }

}
