package CollectionTestKonservi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		
//		TreeSet<Konserva> maza = new TreeSet<Konserva>(new KonservaComparator());
//		
//		maza.add(new Konserva("Olineza", 22, 250));
//		maza.add(new Konserva("Deroni", 30, 550));
//		maza.add(new Konserva("Vitosha", 19, 150));
//		maza.add(new Konserva("Storko", 35, 400));
//		maza.add(new Konserva("Vivi", 19, 150));
//		
//		for(Iterator<Konserva> it = maza.iterator(); it.hasNext();){
//			System.out.println(it.next());
//		}
		Integer chislo = new Integer(5);
		System.out.println(chislo);
		String s = "123";
		
		int w = Integer.parseInt(s);
		System.out.println(w);
		
		int x = chislo.intValue();
		System.out.println(x);
		
		
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(new Integer(5));
		a.add(new Integer(10));
		a.add(new Integer(12));
		a.add(3);
		
		System.out.println(a);
		
		int sum = 0;
		for(Integer an : a ){
			sum += an;
		}
		
		System.out.println(sum);
		
		
	}
}