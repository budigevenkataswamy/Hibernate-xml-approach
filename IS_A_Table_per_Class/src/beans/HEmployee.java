package beans;

public class HEmployee extends Employee {
	private int wh;

	public HEmployee() {
	}

	public HEmployee(int id, String name, String email, int salary,int tool) {
		super(id, name, email, salary);
	}

	public int getWh() {
		return wh;
	}

	public void setWh(int wh) {
		this.wh = wh;
	}

}
