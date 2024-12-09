package elice.elice01.employee;

public class FormalEmployee extends Employee {
	private String type = "정규직";
	private int salary;
	private int empNo;

	public FormalEmployee() {
	}

	public FormalEmployee(String name, String dept, int empNo, int salary) {
		super(name, dept);
		this.empNo = empNo;
		this.salary = salary;
	}

	@Override
	public int getPay() {
		return salary / 12;
	}

	public String getInfo() {
		return type + "," + super.getName() + "," + super.getDept() + "," + empNo + "," + salary;
	}

}
