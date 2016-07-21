package com.directi.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerManager {
    ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

    public void scheduleTasks(Object task) {
        Method[] declaredMethods = task.getClass().getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            processMethod(declaredMethod, task);
        }
    }

    private void processMethod(final Method declaredMethod, final Object task) {
        Scheduler annotation = declaredMethod.getAnnotation(Scheduler.class);
        if (annotation != null) {
            long delay = annotation.delay();
            TimeUnit timeUnit = annotation.timeUnit();
            scheduledExecutorService.schedule(getRunnable(declaredMethod, task), delay, timeUnit);
        }
    }

    private Runnable getRunnable(final Method declaredMethod, final Object task) {
        return new Runnable() {
            public void run() {
                try {
                    declaredMethod.invoke(task);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    public static void main(String[] args) {
        SchedulerManager schedulerManager = new SchedulerManager();
        FriendlyClass task = new FriendlyClass();
        schedulerManager.scheduleTasks(task);
    }

    public static class FriendlyClass {

        @Scheduler(delay = 1, timeUnit = TimeUnit.SECONDS)
        public void sayHello() {
            System.out.println("hello");
        }
    }
}