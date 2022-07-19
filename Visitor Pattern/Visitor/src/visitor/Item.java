package visitor;

public abstract class Item implements Produkt {

String name;
float price;

    public abstract String getName();

    public abstract void setName(String name);

    public abstract float getPrice();

    public abstract void setPrice(float price);



}
