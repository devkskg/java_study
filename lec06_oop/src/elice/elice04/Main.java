package elice.elice04;
//	생성자 실습
class Computer {
	String model;
	
	public Computer() {}
	
	public Computer(String model) {
		this.model = model;
	}
	
	public void info() {
		System.out.println("객체생성완료(모델:" + model + ")");
	}
	
}

public class Main {
	public static void main(String[] args) {
		Computer com1 = new Computer();
		Computer com2 = new Computer("gram");
		
		com1.info();
		com2.info();
	}

}
