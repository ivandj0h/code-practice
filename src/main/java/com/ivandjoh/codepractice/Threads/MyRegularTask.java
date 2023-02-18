package com.ivandjoh.codepractice.Threads;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.Timer;
import java.util.TimerTask;

@Component
public class MyRegularTask extends TimerTask {

    @PostConstruct
    public void init() {
        Timer time = new Timer();
        MyRegularTask taskTimer = new MyRegularTask();
        time.schedule(taskTimer, 0, 60000);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(60000);
            checkDoctorOnline();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // this.cancel(); I do not cancel this Timer
    }

    public void checkDoctorOnline() {
        System.out.println("Doctor is online");
    }

    public static void executeRegularTask(String[] args) {
        MyRegularTask task = new MyRegularTask();
        task.init();
    }
}

