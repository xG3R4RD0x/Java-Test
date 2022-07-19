package visitor;

public class visitor implements visitorInterface {


    Item i;
    float x;
    Item Bi;

    
    public visitor(){




    }
    public void visitItem(Item i) {
        this.i=i;
        reducePrice(x);
        System.out.println("Price of "+i.getName()+" reduced to "+String.valueOf(i.getPrice()+"Euro") );    

        
    }
    
    public void reducePrice(float reduce){
        reduce=0.25f;
       float newPrice= i.getPrice();
       newPrice-=reduce;
       i.setPrice(newPrice);
    }

    public Item billigsteItem(Package pa){
        float PriceTemp=pa.Inhalt.get(0).getPrice();
        Item temp = pa.Inhalt.get(0);
        for(Item iterator:pa.Inhalt){
            if(iterator.getPrice()<PriceTemp){
            PriceTemp=iterator.getPrice();
            temp=iterator;
            }
            
        }
        return temp;

    }

    @Override
    public void visitPackage(Package p) {
    Bi= billigsteItem(p);
    System.out.println("Billigste Item of the Package "+Bi.getName()+" at: "+String.valueOf(Bi.getPrice()+"Euro") );    

    }

}
