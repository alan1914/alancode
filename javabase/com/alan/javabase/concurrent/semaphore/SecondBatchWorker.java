package com.alan.javabase.concurrent.semaphore;

import java.util.concurrent.CountDownLatch;

/**
 * @author stone
 * @des TODO
 * @date 2019/2/15/015 10:08
 **/

class SecondBatchWorker implements Runnable {
    private CountDownLatch latch;

    public SecondBatchWorker(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            latch.await();
            System.out.println("Second batch executed!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
