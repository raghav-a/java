package com.directi.thread_safety;

//has bug - will be solved in class
public class NotifyWaitExample {
    static int extraMoney = 0;

    public void needMoney() throws InterruptedException {
        if (extraMoney > 0) {
            extraMoney--;
        } else {
            wait();
        }
    }

    public void donateMoney() {
        int initialVal = extraMoney;
        extraMoney++;
        if (initialVal == 0) {
            notify();
        }
    }
}