package org.api.couriermanager.serviceTest.employee;

import org.api.couriermanager.entity.employee.Driver;
import org.api.couriermanager.repository.employee.IDriverRepository;
import org.api.couriermanager.factory.employee.DriverFactory;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DriverServiceTest {

    private static Driver driver = DriverFactory.createDriver(
            "1D91",
            "Buck",
            "Rook",
            "2",
            "0218888444",
            "8-Harvest-Three");

    private static IDriverRepository driverRepository;

    @Test
    void create() {

        Driver saved = driverRepository.save(driver);
        Assert.assertEquals(driver.getDriverID(), saved.getDriverID());

    }

    @Test
    void read() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

}