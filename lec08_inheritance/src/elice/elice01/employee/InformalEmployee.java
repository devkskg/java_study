package elice.elice01.employee;

public class InformalEmployee extends Employee {
	private String type = "비정규직";
	private int primaryPay;

	public InformalEmployee() {
	}

	public InformalEmployee(String name, String dept, int primaryPay) {
		super(name, dept);
		this.primaryPay = primaryPay;
	}

	@Override
	public int getPay() {
		return primaryPay;
	}

	public String getInfo() {
		return type + "," + super.getName() + "," + super.getDept() + "," + primaryPay;
	}

}
