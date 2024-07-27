package Factory_design_pattern;

public class DeveloperClient {

	public static void main(String[] args) {
	Employee employee=EmployeeFactory.getEmployee("ANDROID DEVELOPER");
	int salary=employee.salary();
	System.out.println("salary :-"+salary);
	
	Employee employee1=EmployeeFactory.getEmployee("web DEVELOPER");
	int salary2=employee1.salary();
	System.out.println("salary: "+salary2);
	

	}

}
