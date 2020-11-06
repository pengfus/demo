package com.bryce.demo.statemachine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.statemachine.StateMachine;
import org.springframework.stereotype.Component;

@Component
public class StateMachineRunner implements CommandLineRunner {
    @Autowired
    private StateMachine<States, Events> stateMachine;
    @Override
    public void run(String... args) throws Exception {
        stateMachine.sendEvent(Events.EVENT1);
        stateMachine.sendEvent(Events.EVENT2);
        stateMachine.sendEvent(Events.EVENT3);
    }
}
