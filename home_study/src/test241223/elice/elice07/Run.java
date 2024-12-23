package test241223.elice.elice07;

public class Run {

	public static void main(String[] args) {
		
		int sum = 0;
		int n = 0;
		
		while(true) {
			n++;
			sum += n;
			
			if(sum > 1000) {
				break;
			}
		}
		System.out.println(n + "까지의 합:" + sum);
		
	}

}
