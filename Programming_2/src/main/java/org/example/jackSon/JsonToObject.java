package org.example.jackSon;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonToObject {
    public static void main(String[] args) throws Exception{
        ObjectMapper mapper = new ObjectMapper();

        User user = mapper.readValue(new File("data/result.json"), User.class);
        System.out.println(user);

        String jsonString = "{\n" +
                "  \"id\" : 1,\n" +
                "  \"name\" : \"Thuận\",\n" +
                "  \"gender\" : \"Nam\",\n" +
                "  \"address\" : [ {\n" +
                "    \"id\" : 1,\n" +
                "    \"city\" : \"Đà Nẳng\",\n" +
                "    \"street\" : \"Phan Bội Châu\"\n" +
                "  } ],\n" +
                "  \"objectcompany\" : {\n" +
                "    \"id\" : 1,\n" +
                "    \"name\" : \"Mavel\",\n" +
                "    \"address\" : {\n" +
                "      \"id\" : 1,\n" +
                "      \"city\" : \"Đà Nẳng\",\n" +
                "      \"street\" : \"Phan Bội Châu\"\n" +
                "    }\n" +
                "  }\n" +
                "}";
        user = mapper.readValue(jsonString, User.class);
        System.out.println(user);

        jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
        System.out.println(jsonString);
    }
}
