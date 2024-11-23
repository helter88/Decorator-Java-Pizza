package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Prosta pizza
        Pizza plainPizza = new PlainPizza();
        System.out.println(plainPizza.getDescription() + " Cost: " + plainPizza.getCost());

        Pizza cheesePizza = new CheeseDecorator(plainPizza);
        System.out.println(cheesePizza.getDescription() + " Cost: " + cheesePizza.getCost());

        Pizza hamAndCheesePizza = new HamDecorator(cheesePizza);
        System.out.println(hamAndCheesePizza.getDescription() + " Cost: " + hamAndCheesePizza.getCost());

        Pizza hamAndCheesePizzaL = new SizeDecorator(hamAndCheesePizza, PizzaSize.L);
        System.out.println(hamAndCheesePizzaL.getDescription() + " Cost: " + hamAndCheesePizza.getCost());

        Jawlery.builder().prize(BigDecimal.valueOf(254.6)).name("ring").description("new ring").build();

    }
}