package org.example.factoryTest.employee;


import org.example.entity.employee.Driver;
import org.example.factory.employee.DriverFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * ==============
 * <p>
 * Description: Factory test class for creating a Driver
 * Author(s): Justin Jenecke
 * Date: 24/11/2020
 * <p>
 * ================
 */

public class DriverFactoryTest {

    @Test
    public void createDriver(){

        Driver driver = DriverFactory.createDriver(
                "1D91",
                "Buck",
                "Rook",
                "2",
                "0218888444",
                "8-Harvest-Three");

        assertEquals("1D91",driver.getDriverID());
        assertEquals("Buck",driver.getFirstName());
        assertEquals("Rook",driver.getLastName());
        assertEquals("2",driver.getLicenceCode());
        assertEquals("0218888444",driver.getPhoneNo());
        assertEquals("8-Harvest-Three",driver.getAddress());
    }

}