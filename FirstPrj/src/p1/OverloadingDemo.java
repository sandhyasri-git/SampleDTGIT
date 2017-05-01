package p1;

public class OverloadingDemo { // Overloading is having multiple methods with same but diferent signature.Signature includes no of parameters,sequence of parameters,datatype of parameters

	//1.Method overloading
	
	public void show()
	{
		System.out.println("Method with zero parameters");
	}
	public void show(int i)
	{
		System.out.println("Method with one parameters "+i);
	}
	public void show(int i,String str)
	{
		System.out.println("Method with two parameters");
	}
	public void show(String str,int i)
	{
		System.out.println("Method with two parameters and with a dierent sequence");
	}
	//2.Constructor overloading
	public OverloadingDemo()
	{
		System.out.println("Constructor 1");
	}
	public OverloadingDemo(String str)
	{
		System.out.println("Constructor 2 "+str);
	}
	public OverloadingDemo(int i)
	{
		System.out.println("Constructor 3 "+i);
	}
	public OverloadingDemo(int i, int j)
	{
		System.out.println("Constructor 4");
	}
	
	public OverloadingDemo(int i,String str)
	{
		System.out.println("Constructor 5");
	}
	
		public static void main(String[] args) {
		OverloadingDemo p1=new OverloadingDemo(22);
		p1.show("abcd", 100);
		p1.show();
		p1.show(10);
		p1.show(200, "1234");
		OverloadingDemo p2=new OverloadingDemo();
		OverloadingDemo p3=new OverloadingDemo();
	}

}
