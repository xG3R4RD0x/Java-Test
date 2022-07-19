import java.util.ArrayList;


public class komponente {

private ArrayList<zutaten> zutaten = new ArrayList<zutaten>();

    public komponente(){
        addZutaten("bread");

    }

    void topping(){

        System.out.print(zutaten.get(0).getName());
        for(int i=1;i<zutaten.size();i++){
            
            System.out.print(" with ");
            System.out.print(zutaten.get(i).getName());
        }
        System.out.print(" Preis: "+getCost()+"Euros");

    }
    double getCost(){

        double endPreis=0.0;

        for(int i=0;i<zutaten.size();i++){
            endPreis+=zutaten.get(i).getPreis();
        }
        return endPreis;


    }

    void addZutaten(String ingredient){

        switch(ingredient){
            case "bread":
                zutaten.add(new bread());
                break;
            case "cheese":
                zutaten.add(new cheese());
                break;
            case "meat":
                zutaten.add(new meat());
                break;
            case "pickles":
                zutaten.add(new pickles());
                break;
            case "tomaten": //new ingredient
                zutaten.add(new neueZutat());
            default:
                System.out.println("Wir haben dieses Ingredient nicht :(");

        }

        
    }


}
