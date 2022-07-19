package paketdienst;

public class EuropeanUnionHandler implements Handler {

    private Order o;
    public double price=10.50;
    public String name="European Union Handler";

    public EuropeanUnionHandler(Order order) {
    
    this.o=order;
    
    }


    @Override
    public void execute() {
        if ((this.o.getSize()/480000)>1){
        
            price=price*(this.o.getSize()/480000);
        }
        if(this.o.getWeight()>10){

            price=price*(this.o.getWeight()/10);

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
