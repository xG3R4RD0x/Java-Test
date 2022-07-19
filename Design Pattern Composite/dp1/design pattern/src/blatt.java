public class blatt extends komponente {

    public blatt(String name, int personalnummer, String abteilung, String zustaendigkeit, double gehalt) {
        super(name, personalnummer, abteilung, zustaendigkeit, gehalt);
        
    }
    public blatt(){
        super();
    }
    
    public blatt(String name){
        super();
        this.setName(name); 
    }

    public String toString() {
        return "{" + "Name: "+this.getName()+" Personalnummer: "+this.getPersonalnummer()+" Abteilung: "+this.getAbteilung()
        +"Zustaendigkeit: "+this.getZustaendigkeit()+" Gehalt: "+this.getGehalt() +
            "}";
    }


   }

   

