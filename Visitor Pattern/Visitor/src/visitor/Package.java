package visitor;

import java.util.ArrayList;

public class Package implements Produkt{

    public ArrayList<Item> Inhalt = new ArrayList<Item>();

    public Package() {
        
    }
    @Override
    public void accept(visitor v) {
        v.visitPackage(this);
    }
}
