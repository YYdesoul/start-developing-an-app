package com.jizhi.startspingboot.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int add( int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public int sub(int num1,int num2) {
        int sub = num1 - num2;
        return sub;
    }
}
