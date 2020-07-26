
public class MethodOverLoading {

	public static void main(String[] args) {
		MethodOverLoading m = new MethodOverLoading();
		m.sum();
		m.sum(10);
		m.sum(10, 100);
		
//		we can not create a method inside a method
//		same method name with same number of parameters & same data type are not allowed
//		main method can be allowed
//		method overloading : same method name with different parameters & data types
	}
	
	public void sum() {
		System.out.println("sum method with no param");
	}
	public void sum(int i) {
		System.out.println("summethod with one param");
		System.out.println(i);
		
	}
	public void sum(int k, int j) {
		System.out.println("Sum Method with two param");
		int l = k+j;
		System.out.println(l);
	}
}
