
public class IfElseCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  Comparison Operators
		int i = 20;
		int j = 30;
		
		if(i>j) {
			System.out.println("i is greater than j");
		}
		else {
			System.out.println("j is greater than i");
		}
		
		// == operator
		int a = 10;
		int b = 20;
		
		if(a==b) {
			System.out.println("a is equals to b");
		}
		else {
			System.out.println("a is not equals to b");
		}
		
		// printing highest number 
		
		int l = 1000;
		int m = 2000;
		int n = 1500;
		
		if(l>m & l>n) {
			System.out.println("l is greatest number");
		}
		else if(m>l & m>n) {
			System.out.println("m is greatest number");
		}
		else {
			System.out.println("n is greatesr number");
		}
		
	}

}
