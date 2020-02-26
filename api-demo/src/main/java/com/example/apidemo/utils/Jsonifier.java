package com.example.apidemo.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Jsonifier {
    public static String toJson(Object entity) {
        try {
            return new ObjectMapper().writeValueAsString(entity);
        } catch (JsonProcessingException e) {
            throw new Error(e);
        }
    }
}
