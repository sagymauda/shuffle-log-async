package com.example.MsLog.controller;


import com.example.MsLog.service.LogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class LogController {

    private final LogService logService;

    @PostMapping("/log")
    public void documentsIndexing(@RequestBody int number) {

        logService.logRequest(number);

    }
}

