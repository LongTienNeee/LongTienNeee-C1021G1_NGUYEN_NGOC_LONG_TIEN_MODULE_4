package com.longtien.customervalidation.model;

public class PhoneNumber {
    private String numberPhone;

    public PhoneNumber(){}

    public PhoneNumber(String numberPhone) {
        this.numberPhone = numberPhone;

    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "numberPhone='" + numberPhone + '\'' +
                '}';
    }
}
