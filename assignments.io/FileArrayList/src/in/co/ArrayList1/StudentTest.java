package in.co.ArrayList1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

//main function to implement the program

public class StudentTest {
	
	public static void main(String args[]) {
		Student s1=new Student("Arijit",07,88.00);
		Student s2=new Student("Rohit",17,78.00);
		Student s3=new Student("Abir",13,89.00);
		Student s4=new Student("Souvik",45,98.00);
		
		List<Student>arrayList=new ArrayList<Student>();
		
		arrayList.add(s1);				//adding in the arraylist
		arrayList.add(s2);
		arrayList.add(s3);
		arrayList.add(s4);
		
		try {
			FileOutputStream fos=new FileOutputStream("student.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			{
			oos.writeObject(arrayList);
			System.out.println("Done and Dusted");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
