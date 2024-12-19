package elice;

import java.io.File;

public class Elice02_01 {

	public static void main(String[] args) {
        File dir = new File("data");
		File file = new File(dir, "logo.png");
		
        long a = file.length();
        long b = 1000;

        System.out.println(a - b);

	}

}
