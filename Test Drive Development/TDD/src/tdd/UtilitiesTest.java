package tdd;


public class UtilitiesTest {
	public static void main(String args[]) {
		TestAufgabeB test=new TestAufgabeB();
		try {
			test.testIfNull();
			test.testFragezeichenUNDHash();
			test.testEmptyToMinus();
			test.testSpecialToMinus();
			test.testDoubleMinus1();
			test.testDoubleMinus2();
			test.testDoubleMinus3();
			test.testUpperToLower();
			test.testMinusAt();
			test.testMinusAtEnd();
			test.testIfEmpty();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("alle Test erfolgreich durchlaufen");
	}
}
