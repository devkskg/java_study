package elice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		  Scanner scan = new Scanner(System.in);
		  List<Integer> list = new ArrayList<>();
		  int count = 0;
		  int number = scan.nextInt();
		  while(true) {
		      if(number==999&&count%2!=0) {
		          break;
		      } else {
		        list.add(number);
		      }
		      number = scan.nextInt();
		      count++;
		  }
		  int sum = 0;
		  for(int n : list) {
		      sum += n;
		  }
		  double avg = (double)sum/list.size();
		  System.out.println("평균:"+avg);
		  int middleNum = list.size()/2;
		  Collections.sort(list);
		  System.out.println("중간값:"+list.get(middleNum));

	}

}
