package DecoratorPattern;

import DecoratorPattern.Pizza.BasePizza;
import DecoratorPattern.Pizza.Margherita;
import DecoratorPattern.Toppings.ToppingDecorator;

public class Store {
    public static void main(String[] args) {

        BasePizza pizza=new ToppingDecorator.Mushroom(new ToppingDecorator.ExtraCheese(new Margherita()));
        int ans=pizza.cost();
        System.out.println("Total cost of the pizza is "+ ans);
    }
}
