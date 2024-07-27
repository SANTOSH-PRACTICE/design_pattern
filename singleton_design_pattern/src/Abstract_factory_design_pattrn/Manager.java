package Abstract_factory_design_pattrn;

public class Manager implements Employee {

	@Override
	public int salary() {
		return 1000000;
	}

	@Override
	public String name() {
		System.out.println("I am manager");
		return "MANAGER";
	}

}
