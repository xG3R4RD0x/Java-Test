public class CalzonePizzaAlberto extends Pizza {

   String name="Cheese";

    public CalzonePizzaAlberto(){
    this.toppings.add("Tomaten");
    this.toppings.add("kaese");   

    }

    @Override
    public void prepare() {
        System.out.println("Preparing 6 min Calzone Pizza");
        
    }

    @Override
    public void bake() {
        
        System.out.println("Baking 30 min at 350° Calzone Pizza");
                
    }

    @Override
    public void cut() {
        
        System.out.println("cutting Calzone Pizza");
    }

    @Override
    public void box() {
        System.out.println("boxing Calzone Pizza");
        
    }
    

}
