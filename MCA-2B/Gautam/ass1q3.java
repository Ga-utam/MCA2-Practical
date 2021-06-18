class test
{
	void fact(int a)
	{
		for(int i=1;i<=a;i++)
		{
		if(a%i==0)
		System.out.println("factor of "+a+" are "+i);
		}
	}
}

class ass1q3
{
	public static void main(String[] args)
	{
	test obj=new test();
	int l=Integer.parseInt(args[0]);
	obj.fact(l);
	}
}
