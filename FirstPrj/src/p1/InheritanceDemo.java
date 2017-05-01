package p1;

class Parent
{
	public Parent()
	{
		System.out.println("Parent");
	}
	public void displayDetails()
	{
		System.out.println("Display Details method of Parent");
	}
}
class Child extends Parent
{
	public void show()
	{
		System.out.println("Child 1");
	}
}
public class InheritanceDemo extends Parent {
	//Constructor
	public InheritanceDemo()
	{
		System.out.println("Child 2");
	}
	public void display()
	{
		System.out.println("Display method of child");
		//super.displayDetails();
	}
	public static void main(String[] args) {
		Parent d1= new InheritanceDemo();//upward casting
		InheritanceDemo p1=(InheritanceDemo)new Parent();//downward casting
		d1.displayDetails();
		Child c1= new Child();
		c1.show();
		

	}

}
