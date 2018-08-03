package in.co.filesIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {
	
	public static void main(String args[]) 
	{
		Employee e=new Employee("Arijit",10000.00,1456);
		
		try {
			FileOutputStream fos=new FileOutputStream("employee.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
{
			oos.writeObject(e);
			
			System.out.println("Succesfull");
}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}catch(IOException e1) {
			e1.printStackTrace();
		}catch(Exception e1) {
			e1.printStackTrace();
		
		
		
		}
	}
}
