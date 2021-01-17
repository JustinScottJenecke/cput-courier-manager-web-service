package org.api.couriermanager.factory.employee;

import org.api.couriermanager.entity.employee.Helper;

/**==============
 *
 * Description: Factory class for creating a helper
 * Author(s): Justin Jenecke
 * Date: 24/11/2020
 *
 ================*/

public class HelperFactory {

    public static Helper createHelper(String helperID,
                                      String firstName,
                                      String lastName,
                                      String phoneNo,
                                      String address){

        Helper helper = new Helper.Builder()
                .setHelperID(helperID)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setPhoneNo(phoneNo)
                .setAddress(address)
                .build();

        return helper;
    }

}
