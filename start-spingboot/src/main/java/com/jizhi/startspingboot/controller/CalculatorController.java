package com.jizhi.startspingboot.controller;

import com.jizhi.startspingboot.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.websocket.server.PathParam;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/add")
    public int add(@PathParam("num1") int num1, @PathParam("num2") int num2) {
        int result = calculatorService.add(num1, num2);
        return result;
    }

    @GetMapping("/sub")
    public int sub(@PathParam("num1") int num1, @PathParam("num2") int num2) {
        int sub = calculatorService.sub(num1, num2);
        return sub;
    }

    @GetMapping("/div")
    public String div(@PathParam("num1") int num1, @PathParam("num2") int num2) {
        if (num2 == 0) {
            return "num2 can't be 0";
        }
        int div = num1 / num2;
        return String.valueOf(div);
    }
}

