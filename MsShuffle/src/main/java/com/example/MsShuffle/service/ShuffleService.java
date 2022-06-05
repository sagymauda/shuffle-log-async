package com.example.MsShuffle.service;

import com.example.MsShuffle.execptions.InvalidNumberException;

import java.util.List;

public interface ShuffleService {

    List<Integer> shuffle(int number);

}
