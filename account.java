package first_java;

public class account {

	public static void main(String[] args) {
		
		acc_info ai = new acc_info();   
		
		ai.setName("krushna");
		System.out.println(ai.getName());
		
		ai.setbalance(5000);
		System.out.println(ai.getbalance());
		
		
		System.out.println("your remaining balance is : "+ai.withdraw(4000));
		System.out.println("Now your balance is : "+ai.deposite(4000));
	    System.out.println(ai.withdraw(1500));
		

	}

}
