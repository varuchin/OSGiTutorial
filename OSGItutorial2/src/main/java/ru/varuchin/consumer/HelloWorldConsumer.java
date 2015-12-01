package ru.varuchin.consumer;

import com.varuchin.able.HelloWorldService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by varuchin on 01.12.2015.
 */
public class HelloWorldConsumer implements ActionListener {

    private final HelloWorldService service;
    private final Timer timer;


    public HelloWorldConsumer(HelloWorldService service) {
        super();

        this.service = service;

        timer = new Timer(1000, this);
    }

    public void startTimer(){
        timer.start();
    }

    public void stopTimer() {
        timer.stop();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        service.hello();
    }
}
