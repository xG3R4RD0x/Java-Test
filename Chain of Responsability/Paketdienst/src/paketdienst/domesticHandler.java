package paketdienst;

public class domesticHandler implements Handler {

    private Order o;
    public double maxSmall =2;
    public double maxLarge =5;
    public boolean big;
    
    public domesticHandler(Order order) {
        this.o = order;

    }

    @Override
    public void execute() {
        if (this.o.getWeight()>maxSmall || (this.o.getSize()>13500 )){ //big paket
            big=true;
            setNext();
        } else {
            big=false;
            setNext();
        }
        
    }

    @Override
    public void setNext() {
        if(big){
            new LargeDomesticHandler(this.o).execute();
        } else{
            new SmallDomesticHandler(this.o).execute(); 
        }
        
    }
    
}
