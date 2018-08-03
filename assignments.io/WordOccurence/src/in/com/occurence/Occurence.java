package in.com.occurence;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Occurence {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String path;
		int lineNo = 0,check=1;
		System.out.println("Enter file path");
		path = sc.next();
		System.out.println("Enter the word to search");
		String word=sc.next();
		File file = new File(path);
		Scanner in = null;
		try {			//try catch block for exception
			in = new Scanner(file);
			while (in.hasNext()) {
				lineNo++;
				String line = in.nextLine();
				if (line.contains(word)) { //to check if the word is contained in a file
					check=0;
					System.out.println("line is :" + line + " ------>at line number" + lineNo+"\n");
				}
			}
			if(check==1) {
				System.out.println("Word not found");
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

}
