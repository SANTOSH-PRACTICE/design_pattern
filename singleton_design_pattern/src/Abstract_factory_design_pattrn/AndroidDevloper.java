package Abstract_factory_design_pattrn;

public class AndroidDevloper implements Employee{

	@Override
	public int salary() {
		System.out.println("Getting android developer salary");
		return 50000;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		System.out.println("I am android developer");
		return "ANDROID DEVLOPER";
	}

}
