package decoratorPattern;

public class PizzaShop {

    public static void main(String[] args) {
//        Pizza pizza=new PlainPizza();
//        Pizza pizza=new CheesePizzaDecorator(new PlainPizza());
        Pizza pizza=new VeggiePizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));

        pizza.bake();
    }
}
