package Abstract_factory_design_pattrn;

public class WebDevloper implements Employee{

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		System.out.println("Getting web developer salary");

		return 600000;
	}

	@Override
	public String name() {
		System.out.println("I am web developer");
		return "WEB DEVLOPER";
	}

}
