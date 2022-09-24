package com.example.commonapi.service;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.apache.commons.text.RandomStringGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

@Service
public class ReferenceService {
    private static final int leftLimit = 48;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");

    public String newReference(String prefix) {
        return (prefix + "_"+ formatter.format(new Date())+ UUID.randomUUID()).substring(0,50);
    }

    public String newReference() {
        return (formatter.format(new Date()) + UUID.randomUUID()).substring(0,50);
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