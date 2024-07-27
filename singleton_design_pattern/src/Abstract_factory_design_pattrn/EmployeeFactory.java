package Abstract_factory_design_pattrn;

public class EmployeeFactory {
	//get the employee
	public static Employee getEmployee(EmployeeAbstractFactory factory)
	{
		return factory.createEmployee();
	}
}
