package maparayuzornek1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapornek1 {
	public static void main(String [] args) {
		Map map= new HashMap();//map adýyla çaðýracaðýmýz map nesnesi oluþturduk
		//map'e eleman ekliyoruz put metoduyla
		map.put(1,"Berker");
		map.put(2,"Ali");
		map.put(3,"Mustafa ");
		map.put(4," Veli");
		//map nesnemizi Set nesnesine çevirdik entryset metoduyla
		Set set=map.entrySet();
		//þimdide iteratör kullanarak listede gezinmeyi saðlýcaz
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			//burda map entry'e dönüþtürüyoruz çünkü get metodlarýný kullanabiliriz ve anahtar-deðer 2lisini
			//ayrý ayrý çekebiliriz
			Map.Entry entry=(Map.Entry)itr.next();
			//þimdi tek yapacaðýmýz þey listemizi yazdýrmak
			System.out.println(entry.getKey()+": "+entry.getValue());
			
		}
	}
}

