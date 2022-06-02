package com.example.MsShuffle.service;


import com.example.MsShuffle.execptions.InvalidNumberException;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
@RequiredArgsConstructor
public class ShuffleServiceImpl implements ShuffleService {





    @SneakyThrows
    public List<Integer> shuffle(int number) {
        isNumberInRange(number);
        return generateShuffledList(number);

    }


    public void isNumberInRange(int number) throws InvalidNumberException {
        if (number < 1 || number > 1000) {
            throw new InvalidNumberException("Number is not in range of 1 - 1000");
        }
    }


    public static List<Integer> generateShuffledList(int number) {
        List<Integer> numbersListUpToTheArray = new ArrayList<>(number);
        List<Integer> shuffleList = new ArrayList<>(number);
        int num = 1;
        while (number >= num) {
            numbersListUpToTheArray.add(num);
            num++;
        }

        num = num - 2;
        while (numbersListUpToTheArray.size() != 0) {

            int randomNum = ThreadLocalRandom.current().nextInt(0, num + 1);
            shuffleList.add(numbersListUpToTheArray.get(randomNum));
            numbersListUpToTheArray.remove(randomNum);
            num--;

        }


        return shuffleList;
    }

}
