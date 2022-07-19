package paketdienst;

public class basisHandler implements Handler {

    private Order o;
    public basisHandler(Order order) { //start of chain
         this.o=order;
         execute();
    }
    @Override
    public void execute() {
        setNext();
    }

    @Override
    public void setNext() {
        switch (this.o.getAdress()){
            case DOMESTIC :
                new domesticHandler(this.o).execute();
                break;
            case INTERNATIONAL:
                new InternationalHandler(this.o).execute();
                break;
            case EUROPEAN_UNION:
                new EuropeanUnionHandler(this.o).execute();
                break;
        }
    }
}
