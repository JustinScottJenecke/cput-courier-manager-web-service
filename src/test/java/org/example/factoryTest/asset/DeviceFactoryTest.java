package org.example.factoryTest.asset;

import org.example.entity.asset.Device;
import org.example.factory.asset.DeviceFactory;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


/**==============
 *
 * Description: Factory test class for creating a Device
 * Author(s): Justin Jenecke
 * Date: 24/11/2020
 *
 ================*/

public class DeviceFactoryTest {

    @Test
    public void createDevice(){

        Device device = DeviceFactory.createDevice(
                "4D15",
                "Buck",
                "Block",
                80000,
                12000);

        assertEquals("4D15",device.getDeviceID());
        assertEquals("Buck",device.getModel());
        assertEquals("Block",device.getManufacturer());
        assertEquals(80000,device.getValue(),0);
        assertEquals(12000,device.getDepreciatedValue(),0);


    }

}