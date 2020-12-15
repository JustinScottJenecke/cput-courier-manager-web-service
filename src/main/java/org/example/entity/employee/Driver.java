package org.example.entity.employee;

import javax.persistence.Entity;
import javax.persistence.Id;

/**==============
 *
 * Description:Concrete Entity for Vehicle
 * Author(s): Justin Jenecke, Yaseen Levy
 * Date: 20/11/2020
 *
 ================*/

@Entity
public class Driver {

    @Id
    private String driverID;

    private String firstName;
    private String lastName;
    private String licenceCode;

    private String phoneNo;
    private String address;

    protected Driver() {
    }

    private Driver(Builder builder) {

        this.driverID = builder.driverID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.licenceCode = builder.licenceCode;
        this.phoneNo = builder.phoneNo;
        this.address = builder.address;
    }

    public String getDriverID() { return driverID; }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public String getLicenceCode() { return licenceCode; }

    public String getPhoneNo() { return phoneNo; }

    public String getAddress() { return address; }

    @Override
    public String toString() {
        return "Driver{" +
                "driverID='" + driverID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", licenceCode='" + licenceCode + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    // ------  public static inner class  ------

    public static class Builder {

        private String driverID;
        private String firstName;
        private String lastName;
        private String licenceCode;

        private String phoneNo;
        private String address;

        public Builder setDriverID(String driverID) {
            this.driverID = driverID;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setLicenceCode(String licenceCode) {
            this.licenceCode = licenceCode;
            return this;
        }

        public Builder setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder copy(Driver d) {

            this.driverID = d.driverID;
            this.firstName = d.firstName;
            this.lastName = d.lastName;
            this.licenceCode = d.licenceCode;
            this.phoneNo = d.phoneNo;
            this.address = d.address;

            return this;
        }

        public Driver build() {
            return new Driver(this);
        }

    }

}
