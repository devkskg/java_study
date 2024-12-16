package elice;

import java.util.Scanner;

public class Elice05 {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  String str1 = scan.next();
		  String str2 = scan.next();
		  C c = new C();
		  System.out.println(c.deleteChar(str1,str2));

	}

}

class C {
    public String deleteChar(String a, String b){
        for(int i = 0; i < b.length(); i++){
        	String c = "";
        	c += b.charAt(i);
            a.replace(c, "");
        }
        return a;
    }
}