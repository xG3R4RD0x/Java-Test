package paketdienst;
import java.util.Scanner;

public class test {

    public static double weight;
    public static double L;
    public static double W;
    public static double H;
    public static Order o;
    public static String s;
    

     public static void main(String[] args) {
       start();
       System.out.println("Order [Weight= "+weight+"kg, "+"L= "+L
       +"cm, W= "+W+"cm, H= "+H+"cm, Adress= "+s+"]");
       
        new basisHandler(o);

       System.out.println("handled by "+o.getHandler()+ o.getFrankierung());

    }
    public static void start(){
        Scanner sc= new Scanner(System.in);

        System.out.println("Please Insert Order Details");
        System.out.println("Weight?");
        weight= sc.nextDouble();
        System.out.println("Length?");
        L= sc.nextDouble();
        System.out.println("Width");
        W= sc.nextDouble();
        System.out.println("Height?");
        H= sc.nextDouble();
        System.out.println("Address? INTERNATIONAL, EUROPEAN_UNION, DOMESTIC");
        s=sc.next();
        o = new Order(weight, L, W, H, adress.valueOf(s));
        
    }

}
    

