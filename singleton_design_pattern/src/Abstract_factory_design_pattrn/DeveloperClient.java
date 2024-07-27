package Abstract_factory_design_pattrn;

public class DeveloperClient {

	public static void main(String[] args) {
// i want to get android devloper
		
	Employee e1=	EmployeeFactory.getEmployee(new AndriodDevloperFactory());
	
	System.out.println(e1.name());
	
Employee e2=	EmployeeFactory.getEmployee(new WebDevloperFactory());
	
	System.out.println(e2.name());
	
Employee e3=	EmployeeFactory.getEmployee(new ManagerFactory());
	
	System.out.println(e3.name());
		

		

	}

}
