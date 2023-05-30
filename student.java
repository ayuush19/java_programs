package first_java;

public class student {

	public static void main(String[] args) {
		
		stu_info si = new stu_info();   
		
		si.setName("Ayush");
		System.out.println(si.getName());
		
		si.setsid(001);
		System.out.println(si.getsid());
		
		si.setmob(12345);
		System.out.println(si.getmob());
		
		si.setmail("abc@abc.com");
		System.out.println(si.getmail());
		
		System.out.println(si.toString());

	}

}
