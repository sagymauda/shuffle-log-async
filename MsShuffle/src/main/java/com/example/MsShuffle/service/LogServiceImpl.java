package com.example.MsShuffle.service;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class LogServiceImpl implements LogService {

    private final RestTemplate restTemplate;

    @Value("${log.url}")
    private String url;

    @Override
    public void logService(int number) {

        HttpEntity<Integer> request = new HttpEntity<>(number);
        restTemplate.postForEntity(url, request, Integer.class);
    }
}
