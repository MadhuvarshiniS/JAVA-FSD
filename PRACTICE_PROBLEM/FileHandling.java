package Filehandling;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteAppend {
	public static void main(String[] args) throws IOException {
		String s;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		char[] arr = new char[97];
		try{
			File file = new File("D://sample//text.txt");
			if(file.createNewFile())
			{
				System.out.println("File is Created.");
			}else
			{
				System.out.println("File is already exists.");
			}
			FileWriter writer = new FileWriter(file);
			writer.write("This is the 1st file to create like this. \n");
			System.out.println("Enter the statement which you wants to append...");
			s=sc.nextLine();
			writer.append(s+"- This statement is appended");
			writer.close();
			@SuppressWarnings("resource")
			FileReader in=new FileReader("D://sample//text.txt");
			in.read(arr);
			System.out.println(arr);   
		}catch (IOException e) {
            System.out.println("exception occurred " + e);
        }
	}
}

