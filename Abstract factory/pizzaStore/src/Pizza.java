import java.util.ArrayList;

public abstract class Pizza {
    
    public String name;
    ArrayList<String> toppings = new ArrayList<String>();

    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();

    
    
       
}
