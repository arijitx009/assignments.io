package in.com.CountWord;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class WordCount {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
			Scanner get=new Scanner(System.in);
			String path="arijit.txt";
			System.out.println("Enter file path");
			path=get.next();
			File file=new File(path);
			Scanner sc=new Scanner(new FileInputStream(path));
			int wordC=0;
			while(sc.hasNext()) {
				sc.next();
				wordC++;
			}
			sc.close();
			get.close();
			System.out.println("No. words in file are: "+ wordC);
		}

}
