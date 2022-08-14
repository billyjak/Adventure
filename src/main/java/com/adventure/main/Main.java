package com.adventure.main;


import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    ObjectMapper objectMapper = new ObjectMapper();
    public static void main(String[] args) {
        Initializer.initialize();
    }
}
