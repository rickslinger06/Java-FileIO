import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) throws IOException{
	
	System.out.println(countChar('a',"file.txt"));
	readFile("file.txt");
	userRegistration("file.txt");
	
	readFile("file.txt");
	

	}
	
public static int countChar(char c ,String filename){

	int count = 0;
	try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
		while (br.ready()) {
			String line = br.readLine();
			char[] txtArray = line.toCharArray();

			for (char i : txtArray) {
				if (i == c) {
					count++;
				}
			}
		}

	} catch (FileNotFoundException e) {

		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	return count;

}

public static void userRegistration(String file) {
	
	Scanner input = new Scanner(System.in);
	
	
	
	System.out.println("Enter Your name: ");
	String name = input.nextLine();
	
	System.out.println("Enter Your Address: ");
	String address = input.nextLine();
	
	System.out.println("Enter Your E-mail: ");
	String eMAil = input.nextLine();
	
	
	try (BufferedWriter bw = new BufferedWriter(new FileWriter(file ,true))) {
		bw.append(name+",");
		bw.append(address+",");
		bw.append(eMAil + ",");
		bw.newLine();
		
	} catch (IOException e) {
		
		e.printStackTrace();
		
	}

	
	input.close();
	
}
	public static void readFile(String file) {

	try(BufferedReader br = new BufferedReader(new FileReader(file))) {
		while(br.ready()) {
			String line = br.readLine();
			System.out.println(line);
		}
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

	
}
