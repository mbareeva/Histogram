import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class task3 {
	static String s = "C:\\Users\\beeem\\Desktop\\text.txt";
	static String corpora = "C:\\Users\\beeem\\Desktop\\Corpora\\eng_news_2015_10K\\eng_news_2015_10K-sentences.txt";
	
	public static void main(String[] args) {
		//readCharsFromFile(s);
		//createFile(corpora);
		//outputHistogram(s);
		outputHistogram(corpora);
	}

	/*
	 * Task 3. Writing to the file the frequencies of characters in file.
	 */
	
	public static void createFile(String s) {
		int [] count = new int[26];		
		 try {
			FileReader fr = new FileReader(new File(s));
			FileWriter fw = new FileWriter(new File("frequency1.txt"));
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
	
	/*
	 * Create histogram of frequencies.
	 */
	public static void outputHistogram(String filename) {
			int [] count = new int[26];		
			 try {
				FileReader fr = new FileReader(new File(filename));
				FileWriter fw = new FileWriter(new File("frequency2.txt"));
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
					pw.println("\n");
					pw.printf("%c", i + 'A');
					pw.print(":");
					for(int j = 1; j <= count[i]; j++) {
							if(count[i]>0) {
								pw.print("*");
							}
						}
				}
					fr.close();
					pw.close();
			}
			 catch(IOException e) {
				 System.out.println("Error while reading/writing from file!");
			 }
	}
}
