package DecoratorPattern.Toppings;

import DecoratorPattern.Pizza.BasePizza;

public class ToppingDecorator extends BasePizza {
    @Override
    public int cost(){
        return 122;
    }
    public static class ExtraCheese extends ToppingDecorator{
        BasePizza basePizza;
        //basePizza will be settled
        public ExtraCheese(BasePizza basePizza){
            this.basePizza=basePizza;
        }
        @Override
        public int cost(){
            //both basePizza +cost of the topping in the order
        return this.basePizza.cost()+20;
        }
    }
    public static class Mushroom extends ToppingDecorator{
        BasePizza basePizza;
       public Mushroom(BasePizza basePizza){
            this.basePizza=basePizza;
        }
        @Override
        public int cost(){
            return this.basePizza.cost()+10;
        }
    }
}
