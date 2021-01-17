package org.api.couriermanager.factoryTest.operation;

import org.api.couriermanager.entity.operation.Delivery;
import org.api.couriermanager.factory.operation.DeliveryFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class DeliveryFactoryTest {

    @Test
    public void createDelivery(){

        Delivery delivery = DeliveryFactory.createDelivery(
                "D4002",
                "North",
                80);

        assertEquals("D4002",delivery.getDeliveryNo());
        assertEquals("North",delivery.getRoute());
        //assertEquals(80,delivery.getDistance());
        assertEquals(11,delivery.getStops());

    }

}