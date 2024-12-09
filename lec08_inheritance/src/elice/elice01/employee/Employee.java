package elice.elice01.employee;

public abstract class Employee {
	private String name;
	private String dept;

	public Employee() {
	}

	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public abstract int getPay();
}
