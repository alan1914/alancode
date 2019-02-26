package com.alan.javabase.concurrent.semaphore;

import java.util.concurrent.CountDownLatch;

/**
 * @author stone
 * @des TODO
 * @date 2019/2/15/015 10:08
 **/
class FirstBatchWorker implements Runnable {
    private CountDownLatch latch;

    public FirstBatchWorker(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("First batch executed!");
        latch.countDown();
    }
}
