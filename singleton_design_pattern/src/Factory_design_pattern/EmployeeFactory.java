package Factory_design_pattern;

public class EmployeeFactory {
	//get the employee
	public static Employee getEmployee(String empType)
	{
		if(empType.trim().equalsIgnoreCase("ANDROID DEVELOPER"))
		{
			return new Android();
		}
		else if(empType.trim().equalsIgnoreCase("WEB DEVELOPER"))
		{
			return new WebDevloper();
		}
		else {
			return null;
		}
	}

}
