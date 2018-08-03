package in.com.fileexist.io;
import java.io.File;			//for implementing file
import java.util.*;


	
	

public class FileChecker {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath;
		Scanner sc=new Scanner(System.in);			//taking user input
		System.out.println("Enter the file destination");
		filePath=sc.next();
		File f=new File(filePath);
		if(f.exists()&&!f.isDirectory()) {		//checks to see whether the file exists or not
			System.out.println("File do exist at that path");
		}
		else {
			System.out.println("File do not exist");
		}
		sc.close();
	}
}
	
	




