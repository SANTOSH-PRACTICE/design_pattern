package Abstract_factory_design_pattrn;

public class AndriodDevloperFactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		
		return new AndroidDevloper();
	}

}
