package singleton_design_pattern;

public class Jalebi {
	private static Jalebi jalebi = new Jalebi();
	
	private Jalebi()
	{
		
	}
	//Eager way of creating SingleTon object
	public static Jalebi getJalebi() {
		return jalebi;
	}

}
