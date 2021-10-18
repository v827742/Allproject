package logic_practice;

public class ArmstrongNo {
	public static void main(String[] args) {
		
	
	int no=153;
	int temp=no;
	int c=0;
	
	while(temp>0)
	{
		int rmdr=temp%10;
		c=c+(rmdr*rmdr*rmdr);
		temp=temp/10;
		
	}
	if(c==no)
	{
		System.out.println("This is Armstrong number");
		
	}
	else
	{

		System.out.println("This is not Armstrong number");
		
	}

}
}