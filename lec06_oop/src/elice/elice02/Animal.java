package elice.elice02;

public class Animal {
	private String name = "사람";
	private int age = 1;
	
	
	public Animal() {
		this("사람", 1);
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Animal(String name) {
		this.name = name;
	}
	public Animal(int age) {
		this.age = age;
	}
	
	void info() {
		System.out.println(name + ":" + age + "살");
	}
	
}
