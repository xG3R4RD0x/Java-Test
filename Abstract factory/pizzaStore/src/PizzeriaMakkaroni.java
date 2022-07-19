public class PizzeriaMakkaroni implements PizzaBaecker {
    
    public Pizza orderPizza(String pizzaType) {
        Pizza pizza = null;
        switch (pizzaType) {
        case "Cheese":
        pizza = new CheesePizzaMakkaroni();
        break;
        case "Vegetarian":
        pizza = new VegetarianPizzaMakkaroni();
        break;
        case "Pepperoni":
        pizza = new PepperoniPizzaMakkaroni();
        break;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
        }
    
}
