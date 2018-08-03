package in.co.filesIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	
	public static void main(String args[]) 
	{
		Employee e;
		
		try {
			FileInputStream fis=new FileInputStream("employee.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			{
			e=(Employee)ois.readObject();
			System.out.println(e);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch(IOException e1){
			e1.printStackTrace();
		}catch(ClassNotFoundException e1) {
			e1.printStackTrace();
		}catch(Exception e1) {
		e1.printStackTrace();
		}
	}

}
