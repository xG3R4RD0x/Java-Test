package visitor;
public class FreshVegetable extends Item{
    String name;
    float price;

    public FreshVegetable(String name, float Price){

        this.name=name;
        this.price=Price;

    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public void accept(visitor v) {
       v.visitItem(this);
    }

}
