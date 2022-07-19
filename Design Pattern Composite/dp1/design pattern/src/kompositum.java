import java.util.ArrayList;

public class kompositum extends komponente{

    
    public kompositum(String name, int personalnummer, String abteilung, String zustaendigkeit, double gehalt) {
        super();
        super.setName(name);
        super.setPersonalnummer(personalnummer);
        super.setAbteilung(abteilung);
        super.setZustaendigkeit(zustaendigkeit);
        super.setGehalt(gehalt);
    
    }
    public kompositum(String abteilung){ //für den Name der Abteilung
        super();                         //default komponente
        super.setAbteilung(abteilung);   //Name der Abteilung einsetzen
        
    }
    private ArrayList<komponente> zugeordneteMitarbeiter = new ArrayList<komponente>(); //mitarbeiter Liste
    //komponente ist den Datentyp, so dass wir Blätter un kompositum einfügen können

    public void add(kompositum name){
        zugeordneteMitarbeiter.add(name);         
 
     }
     public void remove(kompositum name){
         zugeordneteMitarbeiter.remove(name);
     }


    public void add(blatt name){
       zugeordneteMitarbeiter.add(name);         

    }
    public void remove(blatt name){
        zugeordneteMitarbeiter.remove(name);
    }
    
    public ArrayList<komponente> getZugeordneteMitarbeiter() {
        return zugeordneteMitarbeiter;
    }

    
    public String toString() {
    return "Name: "+this.getName()+" Personalnummer: "+this.getPersonalnummer()+" Abteilung: "+this.getAbteilung()
    +"Zustaendigkeit: "+this.getZustaendigkeit()+" Gehalt: "+this.getGehalt() +"zugehörige Mitarbeiter: "+this.getZugeordneteMitarbeiter();
    }

}
