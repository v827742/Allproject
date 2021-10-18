package static_variable;

public class DemoStaticVariable {
	
	int rollno; //instance variable
	String name;
	
	final int m=10;//it can be a constant when use final keyword not assign again.
	
	static final String college="IBM"; //we have need final variable initialized at that time 
	//static variable we can declare or initialize at that time or in static methods also re assigned static variable
	
	DemoStaticVariable(int r,String s)
	{
		rollno=r;
		name=s;
	}
public void showdetails()
{
	//static int m=10;//Illegal modifier for parameter m; only final is permitted
	//final int a=10;//only final is permitted  local variable.
	
	System.out.println("Rollno: "+rollno+"| "+"Name: "+name+"| "+"College: "+college);
	System.out.println("-----------------------------------------");
}
public static void main(String[] args) {
	
	DemoStaticVariable dsv=new DemoStaticVariable(101, "Ashish");
	DemoStaticVariable dsv1=new DemoStaticVariable(102, "Pankaj");
	DemoStaticVariable dsv2=new DemoStaticVariable(103, "Rakesh");
	
	//DemoStaticVariable.college="SGPA";
	
	dsv.showdetails();
	dsv1.showdetails();
	dsv2.showdetails();
	
}
}
