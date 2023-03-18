package com.jizhi.startspingboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.websocket.server.PathParam;

@RestController
public class CalculatorController {

    @GetMapping("/add")
    public int add(@PathParam("num1") int num1, @PathParam("num2") int num2) {
        int sum = num1 + num2;
        return sum;
    }
}
