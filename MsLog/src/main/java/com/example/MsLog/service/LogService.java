package com.example.MsLog.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

@Service
@Slf4j
public class LogService {

    @Async
    public void logRequest(int number) {
        log.info("A new Request has been submitted with value of :" + number + " At time" + getTimeRequestForLog());
    }

    private static String getTimeRequestForLog() {

        Instant cur;
        return  Instant.now().toString();

    }


}
