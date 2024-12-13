package com.gn.practice09.run;

import java.util.HashMap;
import java.util.Map;

import com.gn.practice09.model.vo.Information;

public class Run {
	public static void main(String[] args) {
//		List<String> listName = new ArrayList<String>();
//		listName.add("John");
//		listName.add("Emma");
//		listName.add("Tom");
//
//		List<String> listNum = new ArrayList<String>();
//		listNum.add("123-456-7890");
//		listNum.add("987-654-3210");
//		listNum.add("555-123-4567");
//
//		List<Integer> listSal = new ArrayList<Integer>();
//		listSal.add(3800000);
//		listSal.add(2300000);
//		listSal.add(4600000);

//		for (String l : list) {
//
//		}

		Map<String, Information> emp = new HashMap<String, Information>();
		emp.put("John", new Information("123-456-7890", 3800000));
		emp.put("Emma", new Information("987-654-3210", 2300000));
		emp.put("Tom", new Information("555-123-4567", 4600000));
		System.out.println("변경전 : " + emp);

//		emp.put("John", new Information("123-456-7890", 4100000));
		emp.get("John").setSalary(4100000);
		System.out.println("변경후 : " + emp);

//		(1)Emma가 전화번호를 바꿨어요.
//		(2)Emma의 정보 출력 -> getter
//		111-111-1111 로 변경
//		=== Emma의 정보 ===
//		전화번호 : 111-111-1111
//		월급 : 2300000

		emp.get("Emma").setPhone("111-111-1111");
		emp.get("Emma").setSalary(2300000);
		System.out.println("=== Emma의 정보 ===");
		System.out.println("전화번호 : " + emp.get("Emma").getPhone());
		System.out.println("월급 : " + emp.get("Emma").getSalary());

//		Map<String, Information> emp2 = new HashMap<String, Information>(emp);
//		emp2 = new TreeMap<String, Information>(emp);
//		System.out.println("정렬후 : " + emp2);
//
//		Map<String, Information> emp3 = new TreeMap<String, Information>(Comparator.reverseOrder());
//		emp3.putAll(emp);
//		System.out.println("역정렬 : " + emp3);
	}
}
