package com.bryce.demo.statemachine;

import org.springframework.statemachine.annotation.OnTransition;
import org.springframework.statemachine.annotation.WithStateMachine;

@WithStateMachine
public class BusinessBean {

    @OnTransition(target = "STATE1")
    public void toState1() {
        System.out.println("do state 1");
    }

    @OnTransition(target = "STATE2")
    public void toState2() {
        System.out.println("do state 2");
    }
}
