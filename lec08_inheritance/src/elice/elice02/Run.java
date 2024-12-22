package elice.elice02;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   int x = sc.nextInt();
		   int y = sc.nextInt();
		   int z = sc.nextInt();
		  Point3D p = new Point3D(x,y,z);
		  System.out.println(p.location());
		  sc.close();
	}
}
