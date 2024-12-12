package com.gn.practice07.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.gn.practice07.model.vo.Equipment;

public class Run {
	public static void main(String[] arsg) {
		Set<Equipment> storage1 = new HashSet<Equipment>();
		storage1.add(new Equipment("라켓", 15000));
		storage1.add(new Equipment("배트", 6000));
		storage1.add(new Equipment("축구공", 3000));
		Set<Equipment> storage2 = new HashSet<Equipment>();
		storage2.add(new Equipment("배트", 6000));
		storage2.add(new Equipment("야구공", 5000));
		storage2.add(new Equipment("글로브", 9000));

		System.out.println("*** 합집합 ***");
		Set<Equipment> all = new HashSet<Equipment>(storage1);
		all.addAll(storage2);

		Iterator<Equipment> i1 = all.iterator();
		while (i1.hasNext()) {
			Equipment e1 = i1.next();
			System.out.println(e1);
		}

		System.out.println("*** 교집합 ***");
		Set<Equipment> retain = new HashSet<Equipment>(storage1);
		retain.retainAll(storage2);

		Iterator<Equipment> i2 = retain.iterator();
		while (i2.hasNext()) {
			Equipment e2 = i2.next();
			System.out.println(e2);
		}

		System.out.println("*** 차집합 ***");
		Set<Equipment> remove = new HashSet<Equipment>(storage1);
		remove.removeAll(storage2);

		i2 = remove.iterator(); // 이런식으로 재할당 해도 된다.
		while (i2.hasNext()) {
			Equipment e3 = i2.next();
			System.out.println(e3);
		}

	}
}
