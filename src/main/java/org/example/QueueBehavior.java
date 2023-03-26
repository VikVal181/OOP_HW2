package org.example;

public interface QueueBehavior {
    void takeInQueue(Buyer actor);
    void acceptOrder();
    void giveOrder();
    void releaseFromQueue();
}
