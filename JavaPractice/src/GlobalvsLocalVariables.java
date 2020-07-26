
public class GlobalvsLocalVariables {

	String name = "Nagaraju";   //Global variables
	int age = 26;
	public static void main(String[] args) {

		int i = 204; //local variable
		System.out.println(i);
		
		
		GlobalvsLocalVariables obj = new GlobalvsLocalVariables();//without creating an object to the class  we can not access the global variables
		System.out.println(obj.name);
		System.out.println(obj.age);
	}
	
	public void sum() {
		int k = 10;// local variables
		int l = 20;
	
		
	}

}
