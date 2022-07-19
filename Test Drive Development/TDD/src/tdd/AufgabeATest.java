package tdd;

import org.junit.Test;

import junit.framework.TestCase;

public class AufgabeATest extends TestCase {
	//u1 fehler testen, leerern String übergeben
	//u2_1 fehler testen, String aus 140 white spaces übergeben
	//u2_2 fehler testen, String aus 141 white spaces übergeben
	//u3 fehler testen, null übergeben
	//g1, wird gekürzt?, mehr als 140 zeichen übergeben
	//g2, wird ... hinzugefügt, mehr als 140 zeichen übergeben
	//g3, wird bei Leerzeichen gekürzt auch wenn weniger als 140 zeichen im Ergenis sind
	//g4, gekürzter Text muss os viel vom Ursprünglichen Text beinhalten wie möglich
	//g5, wird nicht gekürzt, genau 140 zeichen übergeben
	//g6, wird kein ... hinzugefügt, genau 140 zeichen übergeben
	//g7, ungekürzter Text muss Input Text enthalten.
	//g8, im wort trennen wenn keine witespaces, mehr als 140 zeichen fließtext
	//optional Spam vermeiden:
	//og1 mehrfache leerzeichen durch einzelne Leerzeichen ersetzen
	//og2_2, ersetzt Zeilenumbrüche mit Leerzeichen
	//og2_2, ersetzt auch mehre Zeilenumbrüche mit nur einen Leerzeichen
	
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
			System.out.println("G1 liefert einen richtig gekürzten Text zurück");
		}else if(test.length()>140) {
			System.out.println("FEHLER: G1 liefert einen zu langen Text zurück");
		} else if(test.length()<140) {
			System.out.println("FEHLER: G1 liefert einen zu kuzen Text zurück");
		}
	}
	@Test
	public void TestG2() {
		String test=Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyame tempor invidunt ut labore et dolore magna aliquyam aliquyame");
		if(test.endsWith("...")) {
			System.out.println("G4 lifert einen Text mit ... am Ende zurück");
		}else {
			System.out.println("FEHLER: G2 ohne lifert einen Text ohne ... am Ende zurück");
		}
	}
	@Test
	public void TestG3() {
		String test=Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyameeefie");
		test=test.replace("...", "");
		if(test.length()==130) {
			System.out.println("G3 kürzt den Text korrekt");
		}else {
			System.out.println("FEHLER: G3 kürzt den Text inkorrekt");
		}
	}
	@Test
	public void TestG4() {
		String test=Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf invidunt ut labore et dolore magna aliquyam");
		if(test.contains("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf")) {
			System.out.println("G4 enthält so viel Text vom Ursprungstext wie möglich");
		}else{
			System.out.println("FEHLER: G4 kürzt den Text nicht wie erwartet");
		}
	}
	@Test
	public void TestG5() {
		String test=Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf");
		test=test.replace("...", "");
		if(test.length()==140) {
			System.out.println("G5 Ausgabe hat die korrekte länge");
		}else {
			System.out.println("FEHLER: G5 Ausgabe hat nicht die korrekte länge");
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
			System.out.println("G7 Ausgabe enthält den Input Text");
		}else {
			System.out.println("FEHLER: G7 Ausgabe enthält nicht den Input Text");
		}
	}
	@Test
	public void TestG8() {
		String test=Utilities.shortenText("eagtsr4khavrjhtgaebhefnjawhnertgjahiowehrtfrtfenfaerjugvuvduhfeiajrhhfjeihfajdfioaerhvneiojawöguiharioaethtgjniherfaeioghaiojgieharhgirheriha");
		test=test.replace("...", "");
		if(test.length()==140) {
			System.out.println("G8 kürzt das Wort korrekt");
		}else {
			System.out.println("FEHLER: G8 kürzt das Wort inkorrekt");
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
			System.out.println("OG2_1 entfernt korrekt Zeilenumbrüche");
		}else {
			System.out.println("FEHLER: OG2_1 entfernt inkorrekt Zeilenumbrüche");
		}
	}
	@Test
	public void TestOG2_2() {
		String test=Utilities.shortenText("Lorem ipsum dolor sit\n\n\namet, consetetur sadipscing\n\nelitr, sed diam nonumy\neirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf");
		if(test.equals(Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf"))) {
			System.out.println("OG2_2 entfernt korrekt Zeilenumbrüche");
		}else {
			System.out.println("FEHLER: OG2_2 entfernt inkorrekt Zeilenumbrüche");
		}
	}
}
