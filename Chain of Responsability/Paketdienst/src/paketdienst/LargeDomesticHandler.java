package paketdienst;
public class LargeDomesticHandler implements Handler{
    private Order o;
    public double price=6.75;
    public String name="Large Domestic Handler";


    public LargeDomesticHandler(Order o) {
        this.o=o;

    }

    @Override
    public void execute() {
        if ((this.o.getSize()/27000)>1){
        
            price=price*(this.o.getSize()/27000);
        }
        if(this.o.getWeight()>5){

            price=price*(this.o.getWeight()/5);

        }
        this.o.setPreis(this.price);
        this.o.setHandler(name);
        setNext();
    }

    @Override
    public void setNext() {
        new frankierungHandler(this.o).execute();
    }
    
}
