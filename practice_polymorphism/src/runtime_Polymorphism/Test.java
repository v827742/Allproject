package runtime_Polymorphism;

public class Test {
public static void main(String[] args) {
	

	DemoOverriden d=new  DemoOverriden();
	d.m1("Ash");
	d.m1(10);
	DemoOverriden.m1(10, 20);
    
	//d.m1(20.2, 20.6);
}
}