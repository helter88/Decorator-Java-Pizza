package org.example;

public class HamDecorator extends PizzaDecorator {
    public HamDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Ham";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 3.0;
    }
}
