package Iterater_design_pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hii");
		UserManagement management=new UserManagement();
		management.addUser(new User("santosh", "13"));
		management.addUser(new User("mahesh", "14"));
		management.addUser(new User("suresh", "14"));
		management.addUser(new User("somu", "15"));
		
		
		MyIterater iterater=management.getIterater();
		
		while (iterater.hasNext())
		{int a=0;
			//System.out.println(a+1);
			User user=(User)iterater.next();
			System.out.println(user.getName());
		}

		
	}

}
