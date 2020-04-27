package hashmapornekbaskentler;

import java.util.HashMap;

public class Baskentlerornek {
	public static void main(String [] args) {
		//baskentler adında HashMap nesnesi yarattık
		HashMap<String, String> baskentler = new HashMap<String, String>();

	    // Key ve Value değerleri eklicez
	    baskentler.put("England", "London");
	    baskentler.put("Germany", "Berlin");
	    baskentler.put("Norway", "Oslo");
	    baskentler.put("USA", "Washington DC");
	    baskentler.put("Turkey", "Ankara");
	    System.out.println(baskentler);
	    /*Set ve iterasyon kullanmadan sıralama yaptırdık bunun için listemiz aralarında virgül
	    olcak şekilde süslü parantez içinde sıralanacaktır.*/
	}

}
