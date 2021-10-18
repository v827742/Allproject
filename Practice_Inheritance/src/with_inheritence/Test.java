package with_inheritence;

public class Test {
	
	
	public static void main(String[] args) {
		
		Demo1 d=new Demo1();
		
		d.m1();   //with extends keyword we can access the data and methods of parent class with the help of child class
		d.m2();
		System.out.println(d.x);
	}

}
