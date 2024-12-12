package com.gn.practice05;

import java.util.HashSet;
import java.util.Set;

public class Run {
	public static void main(String[] args) {
		Set<Song> songSet1 = new HashSet<Song>();
		songSet1.add(new Song("APT.", "로제"));
		songSet1.add(new Song("Whiplash", "에스파"));
		songSet1.add(new Song("POWER", "G-DRAGON"));
		System.out.println(songSet1);

		Set<Song> songSet2 = new HashSet<Song>();
		songSet2.add(new Song("Wiplash", "에스파"));
		songSet2.add(new Song("HAPPY", "DAY6"));
		songSet2.add(new Song("HAPPY", "DAY6"));
//		if (songSet2.add(new Song("HAPPY", "DAY6"))) {
//
//		} else {
//			System.out.println("중복된 제목과 가수입니다.");
//		}
		System.out.println(songSet2);

	}
}
