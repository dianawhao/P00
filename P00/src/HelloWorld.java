import java.util.regex.*;  
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the licensePlate: ");
        String myString = input.next().toUpperCase();
	
		boolean b = Pattern.matches("[A-Z]{3}[0-9]{4}[A-Z]", myString);
		System.out.println("a valid license plate? " + b);
	}
	
}
