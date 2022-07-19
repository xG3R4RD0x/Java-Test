package tdd;

public class Utilities {
	public static String shortenText(String s) {
		return s;
	}
	public static String prepareStringForUrl(String s) {
		//Zöcklein Johannes, Vasquez Gerardo
		//implementiere testIfNull()
		if(s==null) {
			return null;
		}
		
		//implementiere testFragezeichenUNDHash() 
		s=s.replace("?", "qm");		
		s=s.replace("&", "amp");
		s=s.replace("#", "hash");	

		//implementiere testEmptyToMinus()
		s=s.replace(" ", "-");
		
		//implementiere testSpecialToMinus()
		s= s.replaceAll("[^a-zA-Z0-9]+","-");

		//implementiere testDoubleMinus1-3()
		while(s.contains("--")) {
			s=s.replace("--", "-");
		}
		
		//implementiere testUpperToLower()
		s=s.toLowerCase();
		
		//implementier testMinusAt()
		while(s.startsWith("-")) {
			s=s.substring(1, s.length());
		}
		
		//implementier testMinusAtEnd()
		while(s.endsWith("-")) {
			s=s.substring(0, s.length()-1);
		}
		
		//implementiere testIfEmpty()
		if(s.equals("")) {
			return null;
		}
		
		return s;
	}
}
