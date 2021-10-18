package runtime_Polymorphism;

public class DemoOverriding {
	
	public void m1(String s)
	{
		System.out.println("m1------Demooverriding");
	}
	public int m1(int i)
	{
		System.out.println("m1---int----DemoOverriden");
		return  10;
	}
	private void m1()
	{
		System.out.println("m1-------Private");
	}
	public static void m1(int i,int j)
	{
		System.out.println("m1----int--int");
	}
	public final void m1(float f,float g)
	{
		
	}
}
