package org.example.jackSon;

import java.util.List;

public class User {
    private int id;
    private String name;
    private String gender;
    private Company Objectcompany;
    private List<Address> address;

    public User() {
        super();
    }

    public User(int id, String name, String gender, Company objectcompany, List<Address> address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        Objectcompany = objectcompany;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Company getObjectcompany() {
        return Objectcompany;
    }

    public void setObjectcompany(Company objectcompany) {
        Objectcompany = objectcompany;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", Objectcompany=" + Objectcompany +
                ", address=" + address +
                '}';
    }
}
