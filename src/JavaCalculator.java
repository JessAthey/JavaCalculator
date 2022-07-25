import java.util.Scanner;



class Addition{
	public static void adding(int x, int y) {
		int sum = x + y;
		System.out.println(sum);
	}
}

class Subtraction{
	public static void subtracting(int x, int y) {
		int total = x - y;
		System.out.println(total);
	}
}

class Multi{
	public static void multiplying(int x, int y) {
		int multiple = x * y;
		System.out.println(multiple);
	}
}

class Div{
	public static void divide(int x, int y) {
		int divided = x / y;
		System.out.println(divided);
	}
}

class Square{
	public static void squaring(int x, int y) {
		int squared = x * x;
		int squared2 = y *y;
		System.out.println("the squares of your numbers are " + squared + " and " + squared2);;
	}
}


public class JavaCalculator {

	public static void main(String[] args) {
		
		
		
		int x = 7;
		int y = 2;
	     
		
	     Addition.adding(x, y);
	
	     Subtraction.subtracting(x, y);
	     
	     Multi.multiplying(x, y);
	     
	     Div.divide(x, y);
	     
	     Square.squaring(x, y);
		
	     
	   
	    	
	     
	     
	}

}
