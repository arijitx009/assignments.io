package in.co.ArrayList1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeserializationTest {

	public static void main(String args[]) {
		List<Student>arrayList=new ArrayList<Student>();
		
		try {
			FileInputStream fis=new FileInputStream("student.ser");
			ObjectInputStream oos=new ObjectInputStream(fis);
			{
				arrayList=(ArrayList)oos.readObject();
				System.out.println(arrayList);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
