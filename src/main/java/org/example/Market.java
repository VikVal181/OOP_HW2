package org.example;

import java.util.*;

public class Market implements MarketBehavior, QueueBehavior {
    private List<Buyer> actors = new ArrayList<>();
    private Queue<Buyer> buyers = new ArrayDeque<>();

    @Override
    public void acceptToMarket(Buyer actor) {
        actors.add(actor);
        System.out.println(actor.getName() + " зашел(a) в магазин");
    }

    @Override
    public void releaseFromMarket(Buyer actor) {
        actors.remove(actor);
        System.out.println(actor.getName() + " покинул(a) магазин");
    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Buyer actor) {
        buyers.add(actor);
        System.out.println(actor.getName() + " встал(a) в очередь");
    }

    @Override
    public void acceptOrder() {
        buyers.peek().makeOrder();
        System.out.println(buyers.peek().getName() + " сделал(a) заказ");
    }

    @Override
    public void giveOrder() {
        buyers.peek().takeOrder();
        System.out.println(buyers.peek().getName() + " забрал(a) заказ");
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(buyers.poll().getName() + " покинул(a) очередь");
    }
}
