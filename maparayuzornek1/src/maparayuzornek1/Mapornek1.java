package maparayuzornek1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapornek1 {
	public static void main(String [] args) {
		Map map= new HashMap();//map ad�yla �a��raca��m�z map nesnesi olu�turduk
		//map'e eleman ekliyoruz put metoduyla
		map.put(1,"Berker");
		map.put(2,"Ali");
		map.put(3,"Mustafa ");
		map.put(4," Veli");
		//map nesnemizi Set nesnesine �evirdik entryset metoduyla
		Set set=map.entrySet();
		//�imdide iterat�r kullanarak listede gezinmeyi sa�l�caz
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			//burda map entry'e d�n��t�r�yoruz ��nk� get metodlar�n� kullanabiliriz ve anahtar-de�er 2lisini
			//ayr� ayr� �ekebiliriz
			Map.Entry entry=(Map.Entry)itr.next();
			//�imdi tek yapaca��m�z �ey listemizi yazd�rmak
			System.out.println(entry.getKey()+": "+entry.getValue());
			
		}
	}
}

