package org.api.couriermanager.factory.employee;

import org.api.couriermanager.entity.employee.Driver;

/**==============
 *
 * Description: Factory class for creating a Driver
 * Author(s): Justin Jenecke
 * Date: 24/11/2020
 *
 ================*/

public class DriverFactory {

    public static Driver createDriver(String driverID,
                                      String firstName,
                                      String lastName,
                                      String licenceCode,
                                      String phoneNo,
                                      String address){

        Driver driver = new Driver.Builder()
                .setDriverID(driverID)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setLicenceCode(licenceCode)
                .setPhoneNo(phoneNo)
                .setAddress(address)
                .build();

        return driver;
    }
}
