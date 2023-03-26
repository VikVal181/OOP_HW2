package org.example;

public abstract class Buyer implements buyerBehavior{
    protected String name;
    protected boolean IsMakeOrder = false;
    protected boolean IsTakeOrder = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
