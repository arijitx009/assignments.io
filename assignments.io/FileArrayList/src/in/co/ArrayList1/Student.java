package in.co.ArrayList1;

import java.io.Serializable;

//program for serialization

public class Student implements Serializable{
	private String name;
	private int id;
	private double marks;
	
	public Student(String name, int id, double marks) {			//constructor
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
	}

	public String getName() {				//getters and setters implementation
		return name;
	}

	public int getId() {
		return id;
	}

	public double getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + "]";
	}

}
