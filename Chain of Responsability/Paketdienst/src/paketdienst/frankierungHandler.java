package paketdienst;
public class frankierungHandler implements Handler {

    private double Price;
    private Order O;
    private int B1=0; //1euro
    private int B2=0; //0.50ctvs
    private int B3=0; //0.25ctvs


    public frankierungHandler(Order o){
        this.O=o;


    }
    @Override
    public void execute() {
        Price=O.getPreis();
        B1=(int)Price;
        Price-=(int)Price;
        if((Price-0.5)>=0.0){
            B2=1;
            Price-=0.50;
        }
        if (Price>0.25){
            B2=2;
        }else if (Price>0 && Price<=0.25){
            B2=1;
        }

        this.O.setFrankierung(this.toString());

    }
    public String toString(){
        return "Frankiert mit: "+ B1+" x 1eur, "+B2+" x 0.50eur, "+B3+" x 0.25eur";

    }

    @Override
    public void setNext() {
        // TODO Auto-generated method stub
        
    }
    
}
