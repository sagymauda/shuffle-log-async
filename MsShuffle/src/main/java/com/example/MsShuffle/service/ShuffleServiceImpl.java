package com.example.MsShuffle.service;


import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
@RequiredArgsConstructor
public class ShuffleServiceImpl implements ShuffleService {

    @SneakyThrows
    public List<Integer> shuffle(int number) {
        return generateShuffledList(number);

    }

    public static List<Integer> generateShuffledList(int number) {
        return shuffleArray(createArrayFromZeroToNumber(number));

    }

    private static List<Integer> createArrayFromZeroToNumber(int num) {
        List<Integer> numbersListUpToTheArray = new ArrayList<>(num);
        for (int i = 1; i <= num; i++) {
            numbersListUpToTheArray.add(i);
        }
        return numbersListUpToTheArray;
    }

    private static List<Integer> shuffleArray(List<Integer> list) {
        List<Integer> shuffleList = new ArrayList<>(list.size());
//        list.stream().
        while (list.size() != 0) {

            int randomNum = ThreadLocalRandom.current().nextInt(0, list.size());
            shuffleList.add(list.get(randomNum));
            list.remove(randomNum);

        }
        return shuffleList;
    }

}
