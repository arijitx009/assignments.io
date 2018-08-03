package in.com.countLine;


import java.io.File;					//implementation of file
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;


public class CountLine {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String path;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file path");
		path=sc.next();
		File f=new File(path);
		FileReader fReader=new FileReader(path);			//to read the content in the file
		LineNumberReader lnr;
		if(f.exists()&&!f.isDirectory()) {
			lnr=new LineNumberReader(fReader);
			while(lnr.readLine()!=null) {
			}
			System.out.println("Number of line in file"+lnr.getLineNumber());
		}
		else
		{
			System.out.println("File does not exist");
		}
		sc.close();
		fReader.close();
		}
}

