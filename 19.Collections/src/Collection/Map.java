package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


import comparable.Nadenica;

public class Map {

	public static void main(String[] args) {
		Nadenica leki = new Nadenica("Leki", "kajma", 6);
		Nadenica tandem = new Nadenica("Tandem", "Meso", 9);
		Nadenica boni = new Nadenica("Tandem", "pasta", 9);
		
		
		HashMap<String, Nadenica> mesarnica = new HashMap<String, Nadenica>();
		mesarnica.put("Leki", leki);
		mesarnica.put("Tandem", tandem);
		mesarnica.put("Boni", boni);
		
//		for(String nadenica : mesarnica.keySet()){
//			System.out.println(nadenica + " " + mesarnica.get(nadenica));
//		}
		
//		for(Iterator<String> it = mesarnica.keySet().iterator(); it.hasNext();){
//			String key = it.next();
//			Nadenica value = mesarnica.get(key);
//			System.out.println(key + " " + value);
//		}
		for (Entry<String, Nadenica> entry : mesarnica.entrySet()){
//			entry.getKey();
//			entry.getValue();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
	}
}
