package com.example.MsShuffle.controller;

import com.example.MsShuffle.service.LogServiceImpl;
import com.example.MsShuffle.service.ShuffleServiceImpl;
import com.example.MsShuffle.utils.Utils;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
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

    @SneakyThrows
    @PostMapping("/shuffle")
    public ResponseEntity<List<Integer>> addItem(@RequestParam Integer number) {
        Utils.isNumberInRange(number);

        List<Integer> answer = shuffleService.shuffle(number);

        logService.logService(number);

        return ResponseEntity.ok(answer);

    }

}
