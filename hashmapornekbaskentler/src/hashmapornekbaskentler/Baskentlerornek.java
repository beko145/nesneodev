package hashmapornekbaskentler;

import java.util.HashMap;

public class Baskentlerornek {
	public static void main(String [] args) {
		//baskentler ad�nda HashMap nesnesi yaratt�k
		HashMap<String, String> baskentler = new HashMap<String, String>();

	    // Key ve Value de�erleri eklicez
	    baskentler.put("England", "London");
	    baskentler.put("Germany", "Berlin");
	    baskentler.put("Norway", "Oslo");
	    baskentler.put("USA", "Washington DC");
	    baskentler.put("Turkey", "Ankara");
	    System.out.println(baskentler);
	    /*Set ve iterasyon kullanmadan s�ralama yapt�rd�k bunun i�in listemiz aralar�nda virg�l
	    olcak �ekilde s�sl� parantez i�inde s�ralanacakt�r.*/
	}

}
