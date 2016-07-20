package com.directi.thread_safety;

public class VisibilityIsNotTheOnlyProblem {
    private int common = 0;
    private volatile int visible = 0;

    public static void main(String[] args) {
        final VisibilityIsNotTheOnlyProblem problem = new VisibilityIsNotTheOnlyProblem();
        Runnable target = getTarget(problem);
        for (int loop = 0; loop < 1000; loop++) {
            new Thread(target).start();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("final value for non-volatile var: " + problem.common);
        System.out.println("final value for volatile var: " + problem.visible);
    }

    private static Runnable getTarget(final VisibilityIsNotTheOnlyProblem problem) {
        return new Runnable() {
            public void run() {
                problem.common++;
                problem.visible++;
            }
        };
    }

    private static final Object lock = new Object();

    private static Runnable getTarget2(final VisibilityIsNotTheOnlyProblem problem) {
        return new Runnable() {
            public void run() {
                synchronized (lock) {
                    problem.common++;
                    problem.visible++;
                }
            }
        };
    }
}
