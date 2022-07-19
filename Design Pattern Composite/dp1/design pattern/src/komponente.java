

public class komponente {
    
    private String name;
    private int personalnummer;
    private String abteilung;
    private String zustaendigkeit;
    private double gehalt;

    public komponente(String name,int personalnummer,String abteilung, String zustaendigkeit, double gehalt){

        this.name=name;
        this.personalnummer=personalnummer;
        this.abteilung= abteilung;
        this.zustaendigkeit=zustaendigkeit;
        this.gehalt=gehalt;

    }

    public komponente(){ //default Daten
            this.name="name";
            this.personalnummer=0000;
            this.abteilung= "test";
            this.zustaendigkeit="test";
            this.gehalt=100.00;


    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonalnummer() {
        return this.personalnummer;
    }

    public void setPersonalnummer(int personalnummer) {
        this.personalnummer = personalnummer;
    }

    public String getAbteilung() {
        return this.abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    public String getZustaendigkeit() {
        return this.zustaendigkeit;
    }

    public void setZustaendigkeit(String zustaendigkeit) {
        this.zustaendigkeit = zustaendigkeit;
    }

    public double getGehalt() {
        return this.gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

}
