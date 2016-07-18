package com.directi.inheritance.polymorphism;

public class BetterRouter {

    public void route(Routable routable) {
         deliver(routable.serialize());
    }

    private void deliver(String serialize) {
        //deliver
    }

    public static void main(String[] args) {
        BetterRouter betterRouter = new BetterRouter();
        betterRouter.route(new BetterXmlPacket());
        betterRouter.route(new BetterJsonPacket());
    }
}
