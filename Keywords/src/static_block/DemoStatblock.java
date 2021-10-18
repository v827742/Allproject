package static_block;

public class DemoStatblock {
	
	static
	{
		System.out.println("invoked static blocked");
	}
public static void main(String[] args) {
	System.out.println("main method");
}
}
