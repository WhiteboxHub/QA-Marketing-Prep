package practice2;

public class SwapNumbers {
	
	public void swapWithTemp(int a,int b)
	{
		int temp;
		System.out.println("Value of a before swap:" +a);
		System.out.println("Value of b before swap:" +b);
		temp=a;
		a=b;
		b=temp;
	System.out.println("Value of a after swap:" +a);
	System.out.println("Value of b after swap:" +b);
	}
	public void swapWithOutTemp(int a,int b)
	{
	    System.out.println("Value of a before swap:" +a);
		System.out.println("Value of b before swap:" +b);
		a=a+b;
		b=a-b;
		a=a-b;
		
	System.out.println("Value of a after swap:" +a);
	System.out.println("Value of b after swap:" +b);
	}
	

	public static void main(String[] args) {
		
		SwapNumbers s=new SwapNumbers();
		s.swapWithTemp(5, 10);
		s.swapWithOutTemp(15,20);
	
	}

}
