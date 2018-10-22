import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Probe {
	static String s = "C:\\Users\\beeem\\Desktop\\text.txt";
	
	public static void main(String[] args) {
		//readCharsFromFile(s);		
		//writeStringToFile(s);
		//writeIntToFile(s, 4565);
		//readStringFromFile(s);
		//createFile();
	}
	
public static void readStringFromFile(String s) {
		
		try(BufferedReader reader = new BufferedReader(new FileReader(new File(s)))) {
			String zeile;
			while((zeile = reader.readLine()) != null) {
				System.out.println(zeile);
			}
		}catch (IOException e) {
			
		}
	}
	public static void createFile() {
		try{PrintWriter writer = new PrintWriter("newFile.txt", "UTF-8");
			writer.println("The first symbols in the file.");
			writer.close();
		}
		catch (Exception e) {
			System.out.println("Impossible to create a file");
		}
	}

	public static void writeStringToFile(String s) {
		
		try {
			File file = new File(s);
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("This is a test");
			fileWriter.flush();
			fileWriter.close();
		} catch (Exception e) {
			System.out.print("Error");
		}
	}
	
	//it doesnt matter Integer or int it is
	
	public static void writeIntToFile(String s, Integer i) {
		try {
			Writer wr = new FileWriter(s);
			wr.write(String.valueOf(i));
			wr.close();
		} 
		catch (Exception e){
			System.out.println("Error while writing in file");
		}
	}
	

	
	public static void readCharsFromFile (String inputFile)
	{
		Path path = Paths.get(inputFile);
		
		try(BufferedReader reader = Files.newBufferedReader(path))
		{
			int currentChar; //the int value of ASCII char
			
			while((currentChar = reader.read()) != -1) {
				//currentChar = Normalizer.normalize(currentChar);
				
				if(currentChar != -1) {
				System.out.println((char) currentChar);}
				}
			}
			catch (Exception e) {
				System.err.println("Error while reading from file");
			}
			
		}
	
	public static void writeCharTofile(char[] content, String outputfile) {
		Path path = Paths.get(outputfile);
				try(BufferedWriter writer = Files.newBufferedWriter(path))
				{
					for(char character : content) {
						writer.write(character);
						writer.write(new char[] {49, 50});
					}
			
				}
				catch (Exception e) {
						System.err.println("Error while reading from file");
				}
	}
	
				
}

