package Abstract_factory_design_pattrn;

public class ManagerFactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		// TODO Auto-generated method stub
		return new Manager();
	}

}
