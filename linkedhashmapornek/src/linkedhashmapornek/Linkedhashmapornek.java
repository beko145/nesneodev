package linkedhashmapornek;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmapornek {
public static void main(String arg []) {
	LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
	//map adýnda LinkedHashMap nesnemizi yarattýk ve þimdi ona put metoduyla eleman eklicez
	map.put(01,"Adana");
	map.put(06,"Ankara");
	map.put(14, "Bolu");
	map.put(81, "Düzce");
	//map.entry metodu kullanarak get metodlarýna eriþebiliriz ve key-value 2lisini yazdýrabiliriz.
	
	for(Map.Entry m:map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
		//LinkedHashMap oldugu için outputumuz bizim girdiðimiz sýrada yazýlacaktýr.
	}
	
}

}
