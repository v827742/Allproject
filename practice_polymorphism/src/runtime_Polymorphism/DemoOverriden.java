package runtime_Polymorphism;

public class DemoOverriden extends DemoOverriding{
	@Override
	public void m1(String s)
	{
		System.out.println("Override");
	}
//	@Override //The method m1(int, int) of type DemoOverriden must override or implement a supertype method
//	public static void m1(int i,int i)
//	{
//		System.out.println("Not Override");
//	}
//	@Override //The method m1() of type DemoOverriden must override or implement a supertype method
//	private void m1()
//	{
//		m1();
//		System.out.println("m1-------Overriden");
//	}
	@Override
    public int m1(int i)
    {
    	System.out.println("m1----intt");
    	return 30;
    }
	//@Override//Cannot override the final method from DemoOverriding
//	public final void m1(float f,float g)
//	{
//		m1(20.02,20.12);
//		System.out.println("m1-------final");
//	}
}
