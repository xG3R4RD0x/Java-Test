package paketdienst;

public class Order {

    public Order(double weight,double L,double W, double H,adress adress){
        this.weight=weight;
        this.L=L;
        this.W=W;
        this.H=H;
        this.adress=adress;
        setSize();

    }

    public String getFrankierung() {
        return Frankierung;
    }
    public void setFrankierung(String frankierung) {
        this.Frankierung = frankierung;
    }

    private double weight;
    private adress adress;
    private double L;
    private double W;
    private double H;
    private double Preis;
    private double size;
    private String Handler;
    private String Frankierung;

    
    public double getWeight() {
        return weight;
    }
    public double getPreis() {
        return Preis;
    }
    public void setPreis(double preis) {
        this.Preis = preis;
    }
    public double getL() {
        return L;
    }
    public void setL(double l) {
        this.L = l;
    }
    public double getW() {
        return W;
    }
    public void setW(double w) {
        this.W = w;
    }
    public double getH() {
        return H;
    }
    public void setH(double h) {
        this.H = h;
    }
    public adress getAdress() {
        return adress;
    }
    public void setAdress(adress adress) {
        this.adress = adress;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getSize() {
        return size;
    }
    public void setSize() {
        this.size = L*H*W;
    }
    public String getHandler() {
        return Handler;
    }
    public void setHandler(String handler) {
        this.Handler = handler;
    }
    
 }



