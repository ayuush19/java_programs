package first_java;

public class stu_info {
	
	private String name;
	private int sid;
	private int mob;
	private String email;
	
		public String getName()
		{
			return name;
		}
		public void setName(String a)
		{
			name=a;
		}
		
		public int getsid()
		{
			return sid;
		}
		public void setsid(int b)
		{
			sid=b;
		}
		
		public int getmob()
		{
			return mob;
		}
		public void setmob(int c)
		{
			mob=c;
		}
		
		public String getmail()
		{
			return email;
		}
		public void setmail(String d)
		{
			email=d;
		}
		
		//override the function for converting object to string
		@Override
		   public String toString()
		{
			   return  ("id number = "+ getsid() + "  mobile number =" + getmob());
		}
}
