package com.example.commonapi.service;

import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class ReferenceService {
    private static final int leftLimit = 48;

    public String newReference(String prefix) {
        return prefix + "_" + UUID.randomUUID().toString();
    }

    public String newOTP() {
        int rightLimit = 52;
        int targetStringLength = 6;
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}