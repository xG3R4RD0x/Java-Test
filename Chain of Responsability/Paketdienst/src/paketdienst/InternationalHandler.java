package paketdienst;

public class InternationalHandler implements Handler {
    private Order o;
    public double price=30.0;
    public String name="International Handler";

    public InternationalHandler(Order order) {
        this.o= order;
    
    
    }

    @Override
    public void execute() {
        if ((this.o.getSize()/630000)>1){
        
            price=price*(this.o.getSize()/630000);
        }
        if(this.o.getWeight()>70){

            price=price*(this.o.getWeight()/70);

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
