package first_java;

public class arr {
	
	private String name;
	private int balance;
	
	public arr()
	{
		name="abc";
		balance=10000;
	}
	
	public arr(String n,int b)
	{
		name=n;
		balance=b;
	}
	
	public void display()
	{
		System.out.println(name+" "+balance);
	}


}
