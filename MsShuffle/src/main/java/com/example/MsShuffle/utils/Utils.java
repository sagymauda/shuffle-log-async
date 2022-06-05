package com.example.MsShuffle.utils;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Utils {


    public static ResponseEntity<Object> isNumberInRange(int number)  {
        if (number < 1 || number > 1000) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
        return null;
    }
}
