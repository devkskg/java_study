package selfstudy;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		list.add(3);
//		list.add(2);
//
//		System.out.println(list);
//
//		System.out.println(list.indexOf(3));
		List<Animall> listAnimall = new ArrayList<Animall>();
		listAnimall.add(new Animall("dog", "cat"));
		listAnimall.add(new Animall("horse", "snake"));
//		Iterator<Animall> I = listAnimall.iterator();
//		while()

		System.out.println("0번");
		System.out.println(listAnimall.get(0));
		System.out.println("\n향상 for문");
		for (Animall s : listAnimall) {
			System.out.println(s);
		}
	}

}
