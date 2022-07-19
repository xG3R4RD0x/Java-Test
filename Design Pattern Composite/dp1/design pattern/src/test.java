public class test {
    


        public static void main(String args[]) {
            kompositum sa=new kompositum("Spielwarenabteilung");
            kompositum esa= new kompositum("Einkauf Spielwarenabteilug");
            kompositum vsa= new kompositum("Verkauf Spielwarenabteilung");
            blatt test=new blatt("hans");
            blatt test2=new blatt("test2");
            blatt test3=new blatt("test3");

            sa.add(test);
            sa.add(esa);
            esa.add(test2);
            esa.add(vsa);
            vsa.add(test3);

            System.out.println(sa.toString());            
        }




}
