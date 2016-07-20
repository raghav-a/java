package com.directi.thread_safety;

public class VisibilityProblem {
    private static double var = 0;

    public static void main(String[] args) {
        Thread changeValueObserver = getChangeValueObserverThread();
        Thread changeValueExecutorThread = getChangeValueExecutorThread();
        changeValueObserver.start();
        changeValueExecutorThread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("done");
        changeValueObserver.stop();
    }

    private static Thread getChangeValueExecutorThread() {
        return new Thread(new Runnable() {
            public void run() {
                int loop = 0;
                while (loop++ < 10) {
                    ++var;
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }


    public static Thread getChangeValueObserverThread() {
        return new Thread(new Runnable() {
            public void run() {
                double localNonvolatile = var;
                while (localNonvolatile < 10) {
                    if (localNonvolatile != var) {
                        System.out.println("non volatile var changed to : " + var);
                        localNonvolatile = var;
                    }
                }
            }
        });
    }
}