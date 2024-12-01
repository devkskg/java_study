package pkg04_control_loop;

public class Elice05 {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while(true) {
			sum += num;
			if(sum > 1000) {
				break;
			}
			num++;
		}
		System.out.println(num + "까지의 합:" + sum);
	}
}
