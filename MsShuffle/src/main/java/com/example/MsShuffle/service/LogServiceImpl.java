package com.example.MsShuffle.service;

import com.example.MsShuffle.configuration.ConfigureUrl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class LogServiceImpl implements  LogService {

    private final RestTemplate restTemplate;

    private final ConfigureUrl configureUrl;

    @Override
    public void sendToLogService(int number) {

        HttpEntity<Integer> request = new HttpEntity<>(number);
        restTemplate.postForEntity(configureUrl.getUrl(),request,Integer.class);
    }
}
