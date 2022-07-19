package paketdienst;

public class SmallDomesticHandler implements Handler {
    private Order o;
    public double price = 4.25;
    public String name = "Small Domestic Handler";

    public SmallDomesticHandler(Order o) {
    this.o=o;
    }

    @Override
    public void execute() {

        this.o.setPreis(this.price);
        this.o.setHandler(name);
        setNext();
    }

    @Override
    public void setNext() {
        new frankierungHandler(this.o).execute();
    }
    
}
