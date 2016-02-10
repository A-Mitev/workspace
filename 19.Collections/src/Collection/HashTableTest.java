package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashTableTest {

	public static void main(String[] args) {
		Koli audi = new Koli(4, "diesel", 123, "Audi");
		Koli bmw = new Koli(8, "benzin", 125, "Bmw");
		Koli skoda = new Koli(2, "gas", 888, "Skoda");
		
		HashSet<Koli> garaz = new HashSet<Koli>();
		
		garaz.add(skoda);
		garaz.add(bmw);
		garaz.add(audi);
		
		System.out.println(garaz.contains(new Koli(4, "diesel", 123, "")));
		
		for(Iterator<Koli> it = garaz.iterator(); it.hasNext();){
			System.out.println(it.next());
		}
	}
}
