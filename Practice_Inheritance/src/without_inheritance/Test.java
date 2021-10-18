package without_inheritance;

public class Test {
	
	
	public static void main(String[] args) {
		
		Demo1 d=new Demo1();
		
		//d.m1();   //The method m1() is undefined for the type Demo1
		d.m2();
	//System.out.println(d.x);//x cannot be resolved or is not a field
	}

}
