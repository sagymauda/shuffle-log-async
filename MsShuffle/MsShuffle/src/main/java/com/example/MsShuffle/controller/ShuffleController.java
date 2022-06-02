package com.example.MsShuffle.controller;

import com.example.MsShuffle.service.LogServiceImpl;
import com.example.MsShuffle.service.ShuffleServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class ShuffleController {

    private final ShuffleServiceImpl shuffleService;

    private final LogServiceImpl logService;

    @PostMapping("/shuffle")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<List<Integer>> addItem(@RequestParam @Valid int number) {

        List<Integer> answer = shuffleService.shuffle(number);
        logService.sendToLogService(number);

        return ResponseEntity.ok(answer);

    }

}
