package com.alan.javabase.concurrent.semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author stone
 * @des TODO
 * @date 2019/2/14/014 19:24
 **/
public class UsualSemaphoreSample {
    public static void main(String[] args) {
        System.out.println("Action ... GO!");
        Semaphore semaphore = new Semaphore(5);
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new SemaphoreWorker(semaphore));
            t.start();
        }
    }

}
