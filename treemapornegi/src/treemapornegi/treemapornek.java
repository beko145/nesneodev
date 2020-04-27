package treemapornegi;

import java.util.Map;
import java.util.TreeMap;

public class treemapornek {
public static void main(String args8[]) {
	TreeMap<Integer,String> map=new TreeMap() ;
	map.put(1, "Berker");
	map.put(2,"Ali");
	map.put(3, "Ayþe");
	map.put(4, "Mustafa");
	for(Map.Entry m:map.entrySet()) {
		System.out.println(m.getKey()+". "+m.getValue());
	}
}

}
