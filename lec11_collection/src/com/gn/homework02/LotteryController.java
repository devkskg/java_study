package com.gn.homework02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LotteryController {
	private Set<Lottery> lottery = new HashSet<Lottery>();
	private Set<Lottery> win = new HashSet<Lottery>();

	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}

	public boolean deleteObject(Lottery l) {
		boolean result = false;
		if (lottery.remove(l)) {
			result = true;
		}
		if (win != null) {
			win.remove(l);
		}
		return result;
	}

	public Set<Lottery> searchObject() {
		return lottery;
	}

	public Set<Lottery> winObject() {
		List<Lottery> list = new ArrayList<Lottery>(lottery);
		if (lottery.size() < 4) {
			return null;
		}
		int a = 0;
		while (win.size() < 4) {

			int rd = (int) (Math.random() * (lottery.size() + a));
			win.add(list.get(rd));
			list.remove(rd);
			a -= 1;
		}

		return win;
	}

	public Set<Lottery> sortedWinObject() {
		Set<Lottery> winner = new TreeSet<Lottery>(win);
		return winner;
	}

	public boolean searchWinner(Lottery l) {
		boolean result = false;
		if (win.contains(l)) {
			result = true;
		}
		return result;
	}

}
