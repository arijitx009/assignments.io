package in.co.filesIO;

import java.io.Serializable;

public class Employee implements Serializable {
	private String empname;
	private double Salary;
	private int id;

	public Employee(String empname, double salary, int id) {
		super();
		this.empname = empname;
		Salary = salary;
		this.id = id;
	}

	public String getEmpname() {
		return empname;
	}

	public double getSalary() {
		return Salary;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", Salary=" + Salary + ", id=" + id + "]";
	}
	

}
