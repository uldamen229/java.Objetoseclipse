package entities;

public class funcionario {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return this.grossSalary - tax;
	}
	
	public double increaseSalary(double percentage) {
		return grossSalary += grossSalary * percentage/ 100;
	}
	public String toString() {
		return this.name + "," + "$" + this.netSalary();

	}
}
