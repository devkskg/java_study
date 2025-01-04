package com.gn.practice05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Run01 {
	public static void main(String[] args) {
		Set<Song01> set1 = new HashSet<Song01>();
		Song01 s1 = new Song01("아파트", "로제");
		Song01 s2 = new Song01("위플래시", "에스파");
		Song01 s3 = new Song01("파워", "지디");
		set1.add(s1);
		set1.add(s2);
		set1.add(s3);

		Iterator<Song01> i = set1.iterator();
		while (i.hasNext()) {
			Song01 f = i.next();
			System.out.println(f);
		}
		System.out.println();

		Set<Song01> set2 = new HashSet<Song01>();
		Song01 ss1 = new Song01("위플래시", "에스파");
		Song01 ss2 = new Song01("해피", "데이식스");
		Song01 ss3 = new Song01("해피", "데이식스");
		set2.add(ss1);
		set2.add(ss2);
		set2.add(ss3);
		i = set2.iterator();
		while (i.hasNext()) {
			Song01 f = i.next();
			System.out.println(f);
		}
	}
}
