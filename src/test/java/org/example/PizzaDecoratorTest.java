package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaDecoratorTest {

    @Test
    public void testPlainPizza() {
        Pizza plainPizza = new PlainPizza();
        assertEquals("Plain Pizza", plainPizza.getDescription());
        assertEquals(10.0, plainPizza.getCost());
    }

    @Test
    public void testPizzaWithCheese() {
        Pizza cheesePizza = new CheeseDecorator(new PlainPizza());
        assertEquals("Plain Pizza, Cheese", cheesePizza.getDescription());
        assertEquals(12.5, cheesePizza.getCost());
    }

    @Test
    public void testPizzaWithCheeseAndHam() {
        Pizza cheesePizza = new CheeseDecorator(new PlainPizza());
        Pizza cheeseHamPizza = new HamDecorator(cheesePizza);
        assertEquals("Plain Pizza, Cheese, Ham", cheeseHamPizza.getDescription());
        assertEquals(15.5, cheeseHamPizza.getCost());
    }

}