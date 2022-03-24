
import java.util.ArrayList;

public class Calculator {
	
	public int add (int a, int b) {
		return a + b;	
	}
	
	public int subtract (int a, int b) {
		return a - b;		
	}
	

	public int multiply(int a, int b) {
		return a * b;
		
	}
	public int divide (int a, int b) {
		
		  if (b == 0) {
			   throw new IllegalArgumentException("Division by zero is not supported");
		}
		return a / b;
	 }
	
	public int addList ( ArrayList<Integer> numbers) {
		if(numbers == null || numbers.isEmpty()) {
			throw new IllegalArgumentException("arraylist cannot be empty or null");
		}
		int sum = 0;
		for (int i = 0; i < numbers.size(); i++) {
			sum += numbers.get(i);
		}
		return sum;
	}


}

