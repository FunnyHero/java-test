package roflan;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private int houseNumber;
    private String hullHouse;
    private int apartmentNumber;

    public Address() {
    }

    public Address(String country, String region, String city,
                   String street, int houseNumber, String hullHouse, int apartmentNumber) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.hullHouse = hullHouse;
        this.apartmentNumber = apartmentNumber;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setHullHouse(String hullHouse) {
        this.hullHouse = hullHouse;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getHullHouse() {
        return hullHouse;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", hullHouse='" + hullHouse + '\'' +
                ", apartmentNumber=" + apartmentNumber +
                '}';
    }
}