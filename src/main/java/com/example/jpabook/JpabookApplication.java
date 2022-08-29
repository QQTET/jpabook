package com.example.jpabook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpabookApplication {

    public static void main(String[] args) {

        Hello hello = new Hello();
        hello.setHello("hello");
        String data = hello.getHello();
        System.out.println("Data = "+ data);

        SpringApplication.run(JpabookApplication.class, args);
    }

}
