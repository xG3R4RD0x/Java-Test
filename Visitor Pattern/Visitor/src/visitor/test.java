package visitor;

public class test {
    public static void main(String[] args) {
        
        Package p= new Package();
        p.Inhalt.add(new CannedItem("manzana", 1.0f));
        p.Inhalt.add(new CannedItem("pera", 1.5f));
        p.Inhalt.add(new CannedItem("Agua", 0.5f));
        
        p.accept(new visitor());

        for (Item i:p.Inhalt){
            i.accept(new visitor());
        }
    }
}
