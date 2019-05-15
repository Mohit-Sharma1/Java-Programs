class Objects{
	public static void main(String a[])
	{
	//B obj=new B();
	B obj1=new B(1,2);
	obj1.disp();

	}
}
class B
{
	/*B()
	{
	 System.out.print("hello");	
	}*/
	B(int a, int b)
	{
      System.out.println(" hi");
	}
	void disp()
	{
		System.out.println("Hello Friends");
	}
}