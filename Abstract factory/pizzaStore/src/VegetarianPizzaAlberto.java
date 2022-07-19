public class VegetarianPizzaAlberto extends Pizza {

   String name="Cheese";

    VegetarianPizzaAlberto(){

        this.toppings.add("GoudaCheese");
        this.toppings.add("Diced Tomato Sauce");
        this.toppings.add("Pepper");

    }

    @Override
    public void prepare() {
        System.out.println("Preparing 3 min Vegetarian Pizza");
        
    }

    @Override
    public void bake() {
        
        System.out.println("Baking 20 min at 350° Vegetarian Pizza");
                
    }

    @Override
    public void cut() {
        
        System.out.println("cutting Vegetarian Pizza");
    }

    @Override
    public void box() {
        System.out.println("boxing Vegetarian Pizza");
        
    }
    

}
