package com.gn.homework03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MemberContoroller {
	private Map<String, Member> map = new HashMap<String, Member>();
//	Set<String> ks = map.keySet();
//	Iterator<String> iter = ks.iterator();

	public boolean joinMember(String id, Member m) {
		// 1. 전달 받은 id가 없다면 id와 m을 map에 추가후 true 반환
		// -> containsKey로 판단
		// 2. 이미 있다면 false 값 반환
		boolean result = false;
//		Set<String> ks = map.keySet();
//		Iterator<String> i = ks.iterator();
//		while (i.hasNext()) {
//			String key = i.next();
		if (map.containsKey(id)) {
			result = false;
		} else {
			map.put(id, m);
			result = true;
		}
//		}
		return result;
	}

	public String logIn(String id, String password) {
		String result = null;
		if (map.containsKey(id) && map.get(id).getPassword().equals(password)) {
//			Iterator<String> iter = ks.iterator();
//			while(iter.hasNext()) {
//				String key = iter.next();
//				map.
//			}
			result = map.get(id).getName();
		}
		return result;
	}

	public boolean changePassword(String id, String oldPw, String newPw) {
		boolean result = false;
		if (map.containsKey(id) && map.get(id).getPassword().equals(oldPw)) {
			map.get(id).setPassword(newPw);
			result = true;
		}

		return result;
	}

	public void changeName(String id, String newName) {
		map.get(id).setName(newName);
		map.get(id).getName();

	}

	public TreeMap<String, String> sameName(String name) {
		TreeMap<String, String> map2 = new TreeMap<String, String>();

		Set<String> ks = map.keySet();
		Iterator<String> i = ks.iterator();
		while (i.hasNext()) {
			String key = i.next();

			if (name.equals(map.get(key).getName())) {
				map2.put(key, name);
			}
		}

		return map2;
	}
}
