package tdd;

import org.junit.Test;

import junit.framework.TestCase;

public class AufgabeATestAssertions extends TestCase {
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
	public void TestU1() throws Exception {
		System.out.println(Utilities.shortenText(""));
	}	
    
	@Test
	public void TestU2_1() throws Exception {
		System.out.println(Utilities.shortenText("                                                                                                                                            "));
		System.out.println(Utilities.shortenText("             \n\n                                                                                                                             "));
		System.out.println(Utilities.shortenText("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"));
	}	
	
	@Test
	public void TestU2_2() throws Exception {
		System.out.println(Utilities.shortenText("                                                                                                                                             "));
		System.out.println(Utilities.shortenText("              \n\n                                                                                                                             "));
		System.out.println(Utilities.shortenText("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"));
	}
	
	@Test
	public void TestU3() throws Exception {
		System.out.println(Utilities.shortenText(null));
	}
	
	@Test
	public void TestG1() throws Exception {
		String test=Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyame tempor invidunt ut labore et dolore magna aliquyam aliquyame");
		test=test.replace("...", "");
		assertTrue(test.length()==140);
	}
	
	@Test
	public void TestG2() throws Exception {
		String test=Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyame tempor invidunt ut labore et dolore magna aliquyam aliquyame");
		assertTrue(test.endsWith("..."));
	}
	
	@Test
	public void TestG3() throws Exception {
		String test=Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyameeefie");
		test=test.replace("...", "");
		assertTrue(test.length()==130);
	}
	
	@Test
	public void TestG4() throws Exception {
		String test=Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf invidunt ut labore et dolore magna aliquyam");
		assertTrue(test.contains("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf"));
	}
	
	@Test
	public void TestG5() throws Exception {
		String test=Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf");
		test=test.replace("...", "");
		assertTrue(test.length()==140);
	}
	
	@Test
	public void TestG6() throws Exception {
		String test=Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf");
		assertTrue(!test.endsWith("..."));
	}
	
	@Test
	public void TestG7() throws Exception {
		String test=Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf");
		assertTrue(test.contains("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf"));
	}
	
	@Test
	public void TestG8() throws Exception {
		String test=Utilities.shortenText("eagtsr4khavrjhtgaebhefnjawhnertgjahiowehrtfrtfenfaerjugvuvduhfeiajrhhfjeihfajdfioaerhvneiojaw�guiharioaethtgjniherfaeioghaiojgieharhgirheriha");
		test=test.replace("...", "");
		assertTrue(test.length()==140);
	}
	
	@Test
	public void TestOG1() throws Exception {
		String test=Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur  sadipscing elitr, sed  diam nonumy   eirmod tempor invidunt ut labore     et dolore magna aliquyam aliquyamf");
		assertTrue(test.equals(Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf")));
	}
	
	@Test
	public void TestOG2_1() throws Exception {
		String test=Utilities.shortenText("Lorem ipsum dolor sit\namet, consetetur sadipscing\nelitr, sed diam nonumy\neirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf");
		assertTrue(test.equals(Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf")));
	}
	
	@Test
	public void TestOG2_2() throws Exception {
		String test=Utilities.shortenText("Lorem ipsum dolor sit\n\n\namet, consetetur sadipscing\n\nelitr, sed diam nonumy\neirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf");
		assertTrue(test.equals(Utilities.shortenText("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam aliquyamf")));
	}
}
