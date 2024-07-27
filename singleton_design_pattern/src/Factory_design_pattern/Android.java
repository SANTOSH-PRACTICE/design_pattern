package Factory_design_pattern;

public class Android implements Employee{

	@Override
	public int salary() {
		System.out.println("Getting android developer salary");
		return 50000;
	}

}
