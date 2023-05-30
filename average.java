	package first_java;
	
	import java.util.Scanner;
	
	public class student_marks {
	
		public static void main(String[] args) {
	
				Scanner num= new Scanner (System.in);
				{
				System.out.println("enter mark1= ");
				int mark1= num.nextInt();
				
				System.out.println("enter mark2= ");
				int mark2= num.nextInt();
				
				System.out.println("enter mark3= ");
				int mark3= num.nextInt();
				
				System.out.println("enter mark4= ");
				int mark4= num.nextInt();
				
				int sum=mark1+mark2+mark3+mark4;
				int avg=sum/4;
				{
						if(avg>90)
						{
							System.out.println("Grade A");
						}
						else if(avg<80 && avg>90)
						{
							System.out.println("Grade B");
						}
						else if(avg<70 && avg>80)
						{
							System.out.println("Grade C");
						}
						else if(avg<70)
						{
							System.out.println("Fail!!");
						}
				}
				num.close();
			}
	
	
		}
	
	
	}
