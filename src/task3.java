import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class task3 {
	static String s = "C:\\Users\\beeem\\Desktop\\text.txt";
	
	
	public static void main(String[] args) {
		//readCharsFromFile(s);
		createFile(s);
		
	}

	/*
	 * Task 3. The app.
	 */
	
	public static void createFile(String s) {
		int [] count = new int[26];		
		 try {
			FileReader fr = new FileReader(new File(s));
			FileWriter fw = new FileWriter(new File("frequency.txt"));
			PrintWriter pw = new PrintWriter(fw);
			int currentChar;
			while((currentChar = fr.read()) != -1) {
				char ch = ((char) currentChar);
				ch = Character.toLowerCase(ch);
				if (ch >= 'a' && ch <= 'z') {
				      count[ch - 'a']++;
				      }
			}
			pw.println("The chars frequency is: " + "\n");
			for(int i = 0; i < 26; i++) {
				pw.print("\n");
				pw.printf("%c =  %d\r", i + 'A', count[i]);
				
			}
				fr.close();
				pw.close();
				
		}
		 catch(IOException e) {
			 System.out.println("Error while reading/writing from file!");
		 }
	}
	

}
