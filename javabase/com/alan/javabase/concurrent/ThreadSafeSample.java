package com.alan.javabase.concurrent;

/**
 * @author stone
 * @des TODO
 * @date 2019/2/13/013 17:54
 **/
public class ThreadSafeSample {
    public int sharedState;
    public void nonSafeAction() {
        while (sharedState < 100000) {
            int former = sharedState++;
            int latter = sharedState;
            if (former != latter - 1) {
                System.out.printf("Observed data race, former is " +
                        former + ", " + "latter is " + latter);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final ThreadSafeSample sample = new ThreadSafeSample();
        Thread threadA = new Thread(){
            @Override
            public void run(){
                sample.nonSafeAction();
            }
        };
        Thread threadB = new Thread(){
            @Override
            public void run(){
                sample.nonSafeAction();
            }
        };
        threadA.start();
        threadB.start();
        threadA.join();
        threadB.join();
    }
}

