package tdd;

import org.junit.Test;

import junit.framework.TestCase;

public class AufgabeATest extends TestCase {
	//u1 fehler testen, leerern String �bergeben
	//u2_1 fehler testen, String aus 140 white spaces �bergeben
	//u2_2 fehler testen, String aus 141 white spaces �bergeben
	//u3 fehler testen, null �bergeben
	//g1, wird gek�rzt?, mehr als 140 zeichen �bergeben
	//g2, wird ... hinzugef�gt, mehr als 140 zeichen �bergeben
	//g3, wird bei Leerzeichen gek�rzt auch wenn weniger als 140 zeichen im Ergenis sind
	//g4, gek�rzter Text muss os viel vom Urspr�nglichen Text beinhalten wie m�glich
	//g5, wird nicht gek�rzt, genau 140 zeichen �bergeben
	//g6, wird kein ... hinzugef�gt, genau 140 zeichen �bergeben
	//g7, ungek�rzter Text muss Input Text enthalten.
	//g8, im wort trennen wenn keine witespaces, mehr als 140 zeichen flie�text
	//optional Spam vermeiden:
	//og1 mehrfache leerzeichen durch einzelne Leerzeichen ersetzen
	//og2_2, ersetzt Zeilenumbr�che mit Leerzeichen
	//og2_2, ersetzt auch mehre Zeilenumbr�che mit nur einen Leerzeichen
	
	@Test
	public void TestU1() {
		try {
			System.out.println(Utilities.shortenText(""));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
	@Test
	public void TestU2_1() {
		try {
			System.out.println(Utilities.shortenText("             \n\n                                                                                                                             "));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
	@Test
	public void TestU2_2() {
		try {
			System.out.println(Utilities.shortenText("                \n\n                                                                                                                           "));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void TestU3() {
		try {
			System.out.println(Utilities.shortenText(null));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void TestG1() {
		String test=Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyame tempor invidunt ut labore et dolore magna aliquyam aliquyame");
		test=test.replace("...", "");
		if(test.length()==140) {
			System.out.println("G1 liefert einen richtig gek�rzten Text zur�ck");
		}else if(test.length()>140) {
			System.out.println("FEHLER: G1 liefert einen zu langen Text zur�ck");
		} else if(test.length()<140) {
			System.out.println("FEHLER: G1 liefert einen zu kuzen Text zur�ck");
		}
	}
	@Test
	public void TestG2() {
		String test=Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyame tempor invidunt ut labore et dolore magna aliquyam aliquyame");
		if(test.endsWith("...")) {
			System.out.println("G4 lifert einen Text mit ... am Ende zur�ck");
		}else {
			System.out.println("FEHLER: G2 ohne lifert einen Text ohne ... am Ende zur�ck");
		}
	}
	@Test
	public void TestG3() {
		String test=Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyameeefie");
		test=test.replace("...", "");
		if(test.length()==130) {
			System.out.println("G3 k�rzt den Text korrekt");
		}else {
			System.out.println("FEHLER: G3 k�rzt den Text inkorrekt");
		}
	}
	@Test
	public void TestG4() {
		String test=Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf invidunt ut labore et dolore magna aliquyam");
		if(test.contains("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf")) {
			System.out.println("G4 enth�lt so viel Text vom Ursprungstext wie m�glich");
		}else{
			System.out.println("FEHLER: G4 k�rzt den Text nicht wie erwartet");
		}
	}
	@Test
	public void TestG5() {
		String test=Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf");
		test=test.replace("...", "");
		if(test.length()==140) {
			System.out.println("G5 Ausgabe hat die korrekte l�nge");
		}else {
			System.out.println("FEHLER: G5 Ausgabe hat nicht die korrekte l�nge");
		}
	}
	@Test
	public void TestG6() {
		String test=Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf");
		if(test.endsWith("...")) {
			System.out.println("FEHLER: G6 Ausgabe hat ... am Ende");
		}else {
			System.out.println("G6 Ausgabe hat kein ... am Ende");
		}
	}
	@Test
	public void TestG7() {
		String test=Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf");
		if(test.contains("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf")) {
			System.out.println("G7 Ausgabe enth�lt den Input Text");
		}else {
			System.out.println("FEHLER: G7 Ausgabe enth�lt nicht den Input Text");
		}
	}
	@Test
	public void TestG8() {
		String test=Utilities.shortenText("eagtsr4khavrjhtgaebhefnjawhnertgjahiowehrtfrtfenfaerjugvuvduhfeiajrhhfjeihfajdfioaerhvneiojaw�guiharioaethtgjniherfaeioghaiojgieharhgirheriha");
		test=test.replace("...", "");
		if(test.length()==140) {
			System.out.println("G8 k�rzt das Wort korrekt");
		}else {
			System.out.println("FEHLER: G8 k�rzt das Wort inkorrekt");
		}
	}
	@Test
	public void TestOG1() {
		String test=Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur  sadipscing elitr, sed  diam nonumy   eirmod tempor invidunt ut labore     et dolore magna aliquyam aliquyamf");
		if(test.equals(Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf"))) {
			System.out.println("OG1 entfernt korrekt mehrfache Leerzeichen");
		}else {
			System.out.println("FEHLER: OG1 entfernt inkorrekt mehrfache Leerzeichen");
		}
	}
	@Test
	public void TestOG2_1() {
		String test=Utilities.shortenText("Lorem ipsum dolor sit\namet, consetetur sadipscing\nelitr, sed diam nonumy\neirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf");
		if(test.equals(Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf"))) {
			System.out.println("OG2_1 entfernt korrekt Zeilenumbr�che");
		}else {
			System.out.println("FEHLER: OG2_1 entfernt inkorrekt Zeilenumbr�che");
		}
	}
	@Test
	public void TestOG2_2() {
		String test=Utilities.shortenText("Lorem ipsum dolor sit\n\n\namet, consetetur sadipscing\n\nelitr, sed diam nonumy\neirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf");
		if(test.equals(Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf"))) {
			System.out.println("OG2_2 entfernt korrekt Zeilenumbr�che");
		}else {
			System.out.println("FEHLER: OG2_2 entfernt inkorrekt Zeilenumbr�che");
		}
	}
}
