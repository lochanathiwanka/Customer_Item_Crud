package com.ijse.model;

public class CustomerModel {
    private String cid;
    private String name;
    private String address;

    public CustomerModel() {
    }

    public CustomerModel(String cid, String name, String address) {
        this.cid = cid;
        this.name = name;
        this.address = address;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
