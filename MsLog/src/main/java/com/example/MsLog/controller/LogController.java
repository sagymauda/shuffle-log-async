package com.example.MsLog.controller;


import com.example.MsLog.service.LogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
public class LogController {

    private final LogService logService;

    @PostMapping("/log")
    @ResponseStatus(value = HttpStatus.OK)
    public void documentsIndexing(@RequestBody Integer number) {
        logService.logRequest(number);

    }
}

