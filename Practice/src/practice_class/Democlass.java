package practice_class;

//class like a blueprint of an Object. first define class for create a Object
public class Democlass {

	int a=10;   //instance variable
	static String nm="IBM"; //static variable
	final String ns="ns200";
	
	public void m1()
	{
		int s=10;//local variable
		System.out.println(s+"M1------method");
	}
	public Democlass() {
		System.out.println("Constructor");
	}
static   //it is execute when a class load in memory
{
	System.out.println("Static block");
}
//non static block execute before constuctor
{
	System.out.println("non static block");
}
	public static void main(String[] args) {
		
		Democlass dc=new Democlass();
		dc.m1();
		System.out.println(dc.a);
		System.out.println(dc.nm);
		System.out.println(dc.ns);
	}
	
}
