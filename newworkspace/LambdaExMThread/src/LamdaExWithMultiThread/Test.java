package LamdaExWithMultiThread;

public class Test {

	
	public static void main(String[] args)
	{
		Runnable run=()->{
			
			for(int i=0;i<10;i++)
			{
				System.out.println("Child Thread-1");
			}
		};
		
		Thread t=new Thread(run);
		
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread-1");
		}

		
	}
}
