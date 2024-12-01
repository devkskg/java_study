package pkg04_control_loop;

public class Elice07 {
	public static void main(String[] args) {
		int x;
		int y;
//		3x + 2y = 40
		for(x = 0; x <= 10; x++) {
			for(y = 0; y <= 10; y++) {
				if(3 * x + 2 * y == 40) {
					System.out.println("x=" + x + ",y=" + y);
				}
			}
		}
		
	}

}
