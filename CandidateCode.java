/*import java.util.*;  
class CandidateCode  
{  
public static void main(String[] args)  
{  

int i;
String[] getString=new getString();
Scanner sc= new Scanner(System.in); //System.in is a standard input stream  

for(i=1;i<=5;i++){
System.out.print("Enter a string: ");  
getString[i]= sc.nextLine();
}//reads string   
for(i=1;i<=getString.length;i++)
	{
System.out.print(getString[i]);
	}//output
}  
}  */

/*

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class CandidateCode
{
	// Read multi-line input from console in Java by using two Scanners
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNextLine()) {
			List<String> tokens = new ArrayList<>();
			Scanner lineScanner = new Scanner(scanner.nextLine());

			while (lineScanner.hasNext()) {
				tokens.add(lineScanner.next());
			}

			lineScanner.close();
			System.out.println(tokens);
		}

		scanner.close();
	}
}
*/
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class CandidateCode
{
	// Read multi-line input from console in Java using BufferedReader class
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;
		try {
			while ((line = br.readLine()) != null) {
				String[] tokens = line.split("\\s");
				System.out.println(Arrays.toString(tokens));
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class CandidateCode
{
	// Read multi-line input from console in Java 7 using BufferedReader class
	public static void main(String[] args)
	{
		try (InputStreamReader in = new InputStreamReader(System.in);
			 BufferedReader buffer = new BufferedReader(in)) {
			String line;
			while ((line = buffer.readLine()) != null) {
				String[] tokens = line.split("\\s");
				System.out.println(Arrays.toString(tokens));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}