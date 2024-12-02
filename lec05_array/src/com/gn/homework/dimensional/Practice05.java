package com.gn.homework.dimensional;

import java.util.Random;
import java.util.Scanner;

public class Practice05 {
	public void ptc05() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		int set = 0;
		int win = 0;
		int lose = 0;
		int draw = 0;
		String[] choices = {"가위", "바위", "보"};
		Random random = new Random();
		int rd = random.nextInt(4);
		int mathRandom1 = (int)(Math.random()*10)%3;
		int mathRandom2 = (int)(Math.random()*10)%3;
		int mathRandom3 = (int)(Math.random()*10)%3;
		int mathRandom4 = (int)(Math.random()*10)%3;
		int mathRandom5 = (int)(Math.random()*10)%3;
		int mathRandom6 = (int)(Math.random()*10)%3;
		int mathRandom7 = (int)(Math.random()*10)%3;
		int mathRandom8 = (int)(Math.random()*10)%3;
		int mathRandom9 = (int)(Math.random()*10)%3;
		
		while(true) {
			System.out.print("가위바위보 : ");
			str = sc.next();
			if(str.equals("가위")) {
				if(choices[mathRandom1].equals("가위")) {
					System.out.println("컴퓨터 : 가위");
					System.out.println("사용자 : 가위");
					System.out.println("비겼습니다.");
					draw++;
					set++;
				}else if(choices[mathRandom2].equals("바위")) {
					System.out.println("컴퓨터 : 바위");
					System.out.println("사용자 : 가위");
					System.out.println("졌습니다 ㅠㅠ");
					lose++;
					set++;
				}else if(choices[mathRandom3].equals("보")) {
					System.out.println("컴퓨터 : 보");
					System.out.println("사용자 : 가위");
					System.out.println("이겼습니다 !");
					win++;
					set++;
				}
			} else if(str.equals("바위")) {
				if(choices[mathRandom4].equals("가위")) {
					System.out.println("컴퓨터 : 가위");
					System.out.println("사용자 : 바위");
					System.out.println("이겼습니다 !");
					win++;
					set++;
				}else if(choices[mathRandom5].equals("바위")) {
					System.out.println("컴퓨터 : 바위");
					System.out.println("사용자 : 바위");
					System.out.println("비겼습니다.");
					draw++;
					set++;
				}else if(choices[mathRandom6].equals("보")) {
					System.out.println("컴퓨터 : 보");
					System.out.println("사용자 : 바위");
					System.out.println("졌습니다 ㅠㅠ");
					lose++;
					set++;
				}
			} else if(str.equals("보")) {
				if(choices[mathRandom7].equals("가위")) {
					System.out.println("컴퓨터 : 가위");
					System.out.println("사용자 : 보");
					System.out.println("졌습니다 ㅠㅠ");
					lose++;
					set++;
				}else if(choices[mathRandom8].equals("바위")) {
					System.out.println("컴퓨터 : 바위");
					System.out.println("사용자 : 보");
					System.out.println("이겼습니다 !");
					win++;
					set++;
				}else if(choices[mathRandom9].equals("보")) {
					System.out.println("컴퓨터 : 보");
					System.out.println("사용자 : 보");
					System.out.println("비겼습니다.");
					draw++;
					set++;
				}
			}
			
			if(str.equals("stop")) {
				System.out.println(set + "전 " + win + "승 " + draw + "무 " + lose + "패");
				break;
			} else if(str.equals("가위") || str.equals("바위") || str.equals("보")){
				continue;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
			
		}
		sc.close();
	}
}
