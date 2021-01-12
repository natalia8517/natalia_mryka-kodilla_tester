package com.kodilla.spring.basic.spring_scopes.home;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope("prototype")
public class Clock {

    public void getTime() {
        System.out.println(LocalTime.now());
    }
}
