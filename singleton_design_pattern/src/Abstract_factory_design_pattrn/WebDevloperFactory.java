package Abstract_factory_design_pattrn;

public class WebDevloperFactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		return new WebDevloper();
	}

}
