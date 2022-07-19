public class PizzeriaAlbertoFactory implements PizzaBaecker {
    
    public Pizza orderPizza(String pizzaType) {
        Pizza pizza = null;
        switch (pizzaType) {
        case "Cheese":
        pizza = new CheesePizzaAlberto();
        break;
        case "Vegetarian":
        pizza = new VegetarianPizzaAlberto();
        break;
        case "Pepperoni":
        pizza = new PepperoniPizzaAlberto();
        break;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
        }
}
