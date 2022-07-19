public class PepperoniPizzaMakkaroni extends Pizza {

   String name="Pepperoni";

    public PepperoniPizzaMakkaroni(){
        this.toppings.add("GoudaCheese");
        this.toppings.add("Diced Tomato Sauce");
        this.toppings.add("Pepper");

    }

    @Override
    public void prepare() {
        System.out.println("Preparing 4 min Pepperoni Pizza");
        
    }

    @Override
    public void bake() {
        
        System.out.println("Baking 27 min at 350° Pepperoni Pizza");
                
    }

    @Override
    public void cut() {
        
        System.out.println("cutting Cheese Pizza");
    }

    @Override
    public void box() {
        System.out.println("boxing Cheese Pizza");
        
    }
    

}
