package linkedhashmapornek;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmapornek {
public static void main(String arg []) {
	LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
	//map ad�nda LinkedHashMap nesnemizi yaratt�k ve �imdi ona put metoduyla eleman eklicez
	map.put(01,"Adana");
	map.put(06,"Ankara");
	map.put(14, "Bolu");
	map.put(81, "D�zce");
	//map.entry metodu kullanarak get metodlar�na eri�ebiliriz ve key-value 2lisini yazd�rabiliriz.
	
	for(Map.Entry m:map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
		//LinkedHashMap oldugu i�in outputumuz bizim girdi�imiz s�rada yaz�lacakt�r.
	}
	
}

}
