
public class Bike {
	
	int model;
	String Name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike b=new Bike();
		b.model = 2016;
		b.Name = "Glamour125cc";
		
		Bike c= new Bike();
		c.model = 2017;
		c.Name = "HondaShine125cc";
		
		System.out.println(b.model);
		System.out.println(c.model);
		
		System.out.println(b.Name);
		System.out.println(c.Name);

	}

}
