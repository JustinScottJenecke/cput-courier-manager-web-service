package org.example.factoryTest.asset;

import org.example.entity.asset.Vehicle;
import org.example.factory.asset.VehicleFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**==============
 *
 * Description: Factory test class for creating a Vehicle
 * Author(s): Justin Jenecke
 * Date: 24/11/2020
 *
 ================*/

public class VehicleFactoryTest {

    @Test
    public void createVehicle(){

        Vehicle vehicle = VehicleFactory.createVehicle(
                "1D91",
                "Buck",
                100000,
                80000,
                12000);

        assertEquals("1D91",vehicle.getVehicleID());
        assertEquals("Buck",vehicle.getVehicleCode());
        assertEquals(100000,vehicle.getVehicleKm());
        assertEquals(80000,vehicle.getValue(),0);
        assertEquals(12000,vehicle.getDepreciatedValue(),0);
    }

}
