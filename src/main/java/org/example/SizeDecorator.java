package org.example;

public class SizeDecorator extends PizzaDecorator{

    private PizzaSize size;
    public SizeDecorator(Pizza pizza, PizzaSize size) {
        super(pizza);
        this.size =  size;
    }

    @Override
    public String getDescription() {
        return switch (size) {
            case M -> pizza.getDescription() + " size M";
            case S -> pizza.getCost() + " size S";
            case L -> pizza.getCost() + " size L";
        };
    }

    @Override
    public double getCost() {
        return switch (size) {
            case M -> pizza.getCost() + 5.0;
            case S -> pizza.getCost() + 3.0;
            case L -> pizza.getCost() + 8.0;
        };
    }
}
