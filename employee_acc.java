package first_java;

public class employee_acc {

		private String name;
		private int joining_year;
		private String address;
		
	public employee_acc(String name,int joining_year,String address)
	{
		this.name=name;
		this.joining_year=joining_year;
		this.address=address;
	}
	
	public void display()
	{
		System.out.println(name +"\t"+joining_year+"\t\t"+address+"\n");
	}
	
	
	public static void main(String args[])
	{
		employee_acc emp1=new employee_acc("Robert",1994,"64C-WallsStreet");
		employee_acc emp2=new employee_acc("Sam",2000,"68D-WallsStreet");
		employee_acc emp3=new employee_acc("John",1999,"28B-WallsStreet");
		
		System.out.println("name    year of joining    Address");
		emp1.display();
		emp2.display();
		emp3.display();
		
	}

}


