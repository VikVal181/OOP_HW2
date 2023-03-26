package org.example;

public class Human extends Buyer{
    public Human(String name) {
        super.setName(name);
    }

    @Override
    public void setMakeOrder() {
        IsMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        if(IsMakeOrder) {
            IsTakeOrder = true;
        }
    }

    @Override
    public boolean makeOrder() {
        return IsMakeOrder;
    }

    @Override
    public boolean takeOrder() {
        return IsTakeOrder;
    }
}
