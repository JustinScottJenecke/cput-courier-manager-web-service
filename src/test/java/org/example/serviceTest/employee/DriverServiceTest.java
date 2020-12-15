package org.example.serviceTest.employee;

import org.example.entity.employee.Driver;
import org.example.factory.employee.DriverFactory;
import org.example.repository.employee.IDriverRepository;
import org.example.service.employee.IDriverService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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