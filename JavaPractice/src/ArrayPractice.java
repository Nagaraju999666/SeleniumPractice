
public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// an array is storing similar data type values in single array variables
		
//		array declaration  & initialization 
		
//		inBound Array
		
		int a[] = new int[8];
		 a[0] = 100;
		 a[4] = 600;
		 a[5] = 800;
		 
		 System.out.println(a[4]);
		 System.out.println(a[0]);
		 
//		 System.out.println(a[9]); Array Index OutOfBound Exception
		 
		 System.out.println(a.length); //to find length of array
		 
//		 to print all values in array by using for loop
		 for(int j=0; j<a.length; j++) {
		
		System.out.println(a[j]);

	}
// dis advantages of arrays:
//		 1. the size is fixed (static array): so to over come this we need to use collection topic....
//		 2. and we can store only single data type variables we can not store multiple data type variables to over come this we can use Object Class
		 
//		 char array
		 
		 char c[] = new char[5];
		 c[1] = 'a';
		 c[2] = '4';
		 c[4] = '$';
		 System.out.println(c[4]);
		 
//		 double array
		 double d[] = new double[2];
		 d[0] = 12.99;
		 d[1] = 33.99;
		 System.out.println(d[1]);
		 
		 
//		 String array
		 String s[] = new String[5];
		 s[0] = "Hello";
		 s[1] = "World";
		 System.out.println(s.length);
		 System.out.println(s[1]);
		 
//		 Object Class to store different data types
		 Object ob[] = new Object[4];
		 ob[0] = "hello";
		 ob[1] = 8;
		 ob[2] = 12.33;
		 ob[3] = '$';
		 System.out.println(ob.length);
		 System.out.println(ob[1]);
		 
}
}
