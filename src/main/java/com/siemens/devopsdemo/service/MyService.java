package com.siemens.devopsdemo.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public int addNumber(int a, int b){
        return a+b;
    }
}
