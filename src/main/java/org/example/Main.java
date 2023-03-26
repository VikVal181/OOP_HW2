package org.example;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Вася");
        Human h2 = new Human("Маша");
        Human h3 = new Human("Петя");

        Market market = new Market();

        market.acceptToMarket(h1);
        market.takeInQueue(h1);
        market.acceptToMarket(h2);
        market.acceptToMarket(h3);
        market.takeInQueue(h3);
        market.acceptOrder();
        market.giveOrder();
        market.releaseFromQueue();
        market.acceptOrder();
        market.releaseFromMarket(h1);
        market.releaseFromMarket(h2);
        market.giveOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(h3);




    }
}