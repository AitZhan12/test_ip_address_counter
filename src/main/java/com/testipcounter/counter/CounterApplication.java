package com.testipcounter.counter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CounterApplication {


    public static void main(String[] args) {
        SpringApplication.run(CounterApplication.class, args);
        counter();
    }

    private static void counter() {
        IpCounter ipCounter = new IpCounter();
        ipCounter.countIpAddress();
    }

}
