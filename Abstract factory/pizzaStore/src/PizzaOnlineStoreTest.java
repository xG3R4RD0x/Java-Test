public class PizzaOnlineStoreTest {
    public static void main(String[] args) {
    
        PizzeriaAlbertoFactory store = new PizzeriaAlbertoFactory();
        PizzeriaMakkaroni store2 = new PizzeriaMakkaroni();

        Pizza pizza= store.orderPizza("Cheese");
        System.out.println("We ordered a "+ pizza);

        pizza = store2.orderPizza("Cheese");
        System.out.println("We ordered a "+ pizza);

        pizza = store.orderPizza("Pepperoni");
        System.out.println("We ordered a "+ pizza);

        pizza = store2.orderPizza("Pepperoni");
        System.out.println("We ordered a "+ pizza);

    }
}
