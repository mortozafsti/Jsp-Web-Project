
package JavaClase;

import java.util.Collection;

public class Address {
    
    private String line;
    private String city;
    private String country;
    private String postCode;
    private Collection phoneNumber;

    public Address() {
    }

    public Address(String line, String city, String country, String postCode, Collection phoneNumber) {
        this.line = line;
        this.city = city;
        this.country = country;
        this.postCode = postCode;
        this.phoneNumber = phoneNumber;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Collection getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Collection phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
}
