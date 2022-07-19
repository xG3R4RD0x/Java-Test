public class CheesePizzaMakkaroni extends Pizza {

   String name="Cheese";

    public CheesePizzaMakkaroni(){
        this.toppings.add("GoudaCheese");
        this.toppings.add("Diced Tomato Sauce");
        this.toppings.add("Pepper");
        
    }

    @Override
    public void prepare() {
        System.out.println("Preparing 5 min Cheese Pizza");
        
    }

    @Override
    public void bake() {
        
        System.out.println("Baking 25 min at 350° Cheese Pizza");
                
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
