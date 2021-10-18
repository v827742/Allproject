package multilevel_inheritence;

public class Test {

	public static void main(String[] args) {
		
		A a=new A();
		a.m1();
		a.m2();
		//a.m3();  The method m4() is undefined for the type A
		//a.m4();  method check by constructor variable if present then execute
		System.out.println(a.i);
		System.out.println(a.j);
//		System.out.println(a.a);   variable check by reference variable if present in class then execute
//		System.out.println(a.b);
//		System.out.println(a.c);
//		System.out.println(a.d);
//		
		
		B b=new B();
		b.m1();
		b.m2();
		b.m3(); // The method m4() is undefined for the type A
	//	b.m4();  not present in A and B class 
		System.out.println(a.i);
		System.out.println(a.j);
	System.out.println(b.a); //  variable check by reference variable if present in class then execute
	System.out.println(b.b);
	//System.out.println(b.c);  not present in B and A class
	//.out.println(b.d);
	
		
		C c=new C();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		
		System.out.println(c.i);
		System.out.println(c.j);
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
		System.out.println(c.d);
		
		
		
				
		
		
		
	}
}
