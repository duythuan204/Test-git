package org.example.jackSon;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ObjectToJson {
    public static void main(String[] args) throws Exception{
        User user = getUser();

        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(new File("data/result.json"), user);

        String jsonString = mapper.writeValueAsString(user);
        System.out.println("Json: " +jsonString);

        jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
        System.out.println("Json pretty paint: "+jsonString);
    }

    private static User getUser() {
        Address address = new Address(1, "Đà Nẳng", "Phan Bội Châu");
        Company company = new Company(1, "Mavel", address);
        List<Address> listAddress = new ArrayList<>();
        listAddress.add(address);

        return new User(1, "Thuận", "Nam", company, listAddress);
    }
}
