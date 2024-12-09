package com.gn.study.controller;

import com.gn.study.model.vo.Alarm;
import com.gn.study.model.vo.Animal;
import com.gn.study.model.vo.Beverage;
import com.gn.study.model.vo.Cat;
import com.gn.study.model.vo.Coffee;
import com.gn.study.model.vo.Dog;
import com.gn.study.model.vo.Earth;
import com.gn.study.model.vo.FireAlarm;
import com.gn.study.model.vo.Mars;
import com.gn.study.model.vo.OrangeJuice;
import com.gn.study.model.vo.Planet;

public class Run {
	public static void main(String[] args) {
		
//		1. 클래스의 업캐스팅
		int i_num = 3;
		double d_num = i_num;
		System.out.println(d_num);
		
		Beverage b1 = new Coffee(); // 왼쪽에는 껍데기, 오른쪽은 알맹이
		Beverage b2 = new OrangeJuice(); // Import 해줘야한다.
		
		
		b1.drink();
		b2.drink();
		
		System.out.println("=====");
		
		
		
//		2. 객체 배열과 다형성
		Beverage[] arr = new Beverage[3];
		
		Beverage bev = new Beverage();
		arr[0] = bev;
		
		Coffee cof = new Coffee();
		arr[1] = cof;
		
		OrangeJuice oj = new OrangeJuice();
		arr[2] = oj;
		
		for(Beverage b : arr) {
			b.drink();
		}
		
		System.out.println("=====");
		
		
		
//		3. 클래스 다운캐스팅
//		Beverage b1 = new Coffee(); // 왼쪽에는 껍데기, 오른쪽은 알맹이
//		b1.ice 부모는 자식의 것을 쓸 수 없다.
//		부모를 자식으로 낮춘 다음에 써야한다.
//		((Coffee)b1).ice();
		
//		이건 자연스러운 것 
//		Coffee b3 = new Coffee();
//		b3.ice();
		
//		(Coffee)b1.ice(); 왼쪽이 가진 메소드 중에 ice를 가져오겠다. b1의 ice
		((Coffee)b1).ice();
		((OrangeJuice)b2).fresh();
		
//		Coffee 객체화 한 b3에 b1을 다운캐스팅하여 입력 후 메소드 호출
		Coffee b3 = new Coffee();
		b3 = (Coffee)b1;
		b3.ice();
		
		System.out.println("=====");

//		객체 배열 만들고 for each 하고싶으면?
//		만약 진짜 데이터가 Coffe면 ice()메소드 호출 -> instanceof 연산자
		for(Beverage b : arr) {
			if(b instanceof Coffee) {
				((Coffee)b).ice();
			} else if(b instanceof OrangeJuice) {
				((OrangeJuice)b).fresh();
			} else {
				b.drink();
			}
			
		}
//		만약 진짜 데이터가 OrangeJuice면 fresh()메소드 호출
		
		System.out.println("=====");
		
		
		
//		4. 정적 바인딩 - 오버로딩
		Planet myPlanet = new Planet();
		myPlanet.description();
		myPlanet.description(46);
		
		System.out.println("=====");
		
		
		
//		5. 동적 바인딩 - 오버라이딩
		Planet p1 = new Earth();
		Planet p2 = new Mars();
		
		p1.material();
		p2.material();
//		((Planet)p1).material(); 이거 왜 지구 나옴? 겉 껍질만 업캐스팅 가능한 느낌?
		
		
		System.out.println("=====");
		
		
		
//		6. 추상 메소드
		Animal dog = new Dog();
		Animal cat = new Cat();
		dog.sound();
		cat.sound();
//		Animal a = new Animal(); // 추상 클래스는 객체화의 구현체에 사용을 못한다.
		cat.breath();
		
		System.out.println("=====");
		
		
		
//		7. 인터페이스
		Alarm a = new FireAlarm();
		System.out.println(Alarm.MAX_VOLUME);
		a.soundAlarm();
		
		
		
	}
}
