package com.example.MsLog.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
@Slf4j
public class LogService {

    @Async
    public void logRequest(int number) {
        log.info("A new Request has been submitted with value of :"+number +" At time" +getTimeRequestForLog());
    }


    public String  getTimeRequestForLog(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }


}
