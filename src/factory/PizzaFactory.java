package factory;

public class PizzaFactory {

    public static Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new PlainCheesePizza();
        } else if (type.equals("chicken")) {
            pizza = new ChickenPizza();
        } else if (type.equals("veg")) {
            pizza = new VegPizza();
        }


        return pizza;
    }
}
