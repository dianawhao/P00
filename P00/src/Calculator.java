
public class Calculator {
	public int add (int a, int b) {


		return a + b;
				
		//hello, i am with w65E_


		

	}
	public int subtract (int a, int b) {
		return a - b;
		
	}
	
	public int multiple (int a, int b) {
		return a * b;
		
	}
	public int divide (int a, int b) {
		
		  if (b == 0) {
			   throw new IllegalArgumentException("Division by zero is not supported");
			  }

			  return a / b;
	 }

	
}

