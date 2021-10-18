package complieTime_polymorphism;

public class DemoOverloading {
	
	int i;
	int j;
	
	public void m1()
	{
		System.out.println("M1------method");
	}
	public void m1(int i)
	{
		System.out.println("M1---------Integer");
	}
	
	public String m1(String s)//Duplicate method m1() in type DemoOverloading
	{
		System.out.println("m1-------String");
		return "Ashish";
	}
	public void m1(int i ,int j)
	{
	this.i=i;
	this.j=j;
		System.out.println("m1------integer");
	}
public static void main(String[] args) {
	DemoOverloading d = new DemoOverloading();
	d.m1();
	d.m1(10);
	String s=d.m1("A");
	System.out.println(s);
	d.m1(10, 20);
	System.out.println(d.i);
	System.out.println(d.j);
}
}
