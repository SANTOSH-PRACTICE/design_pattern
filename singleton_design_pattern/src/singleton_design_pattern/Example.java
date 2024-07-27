package singleton_design_pattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//new Samosa();
		/*
		 * //singleton pattern
		 * 
		 * //Lazy way of creating single object Samosa samosa1= Samosa.getSamosa();
		 * System.out.println(samosa1.hashCode());
		 * 
		 * Samosa samosa2= Samosa.getSamosa(); System.out.println(samosa2.hashCode());
		 * 
		 * 
		 * //Eager way of creating SingleTon object
		 * System.out.println(Jalebi.getJalebi().hashCode());
		 * System.out.println(Jalebi.getJalebi().hashCode());
		 */
		
		
		//1)Reflection API to break singleton pattern
//		solution 1)if object is there ==>throw exception from inside Constructor
//				2)use enum
//		2 deserilization
//		solution implimenting readResolve method
				

		
		
		//Break single ton
//       Samosa s1=Samosa.getSamosa();
//		System.out.println(s1.hashCode());
//		 Constructor<Samosa> constructor =Samosa.class.getDeclaredConstructor();
//		 constructor.setAccessible(true);
//		 Samosa s2=constructor.newInstance();
//		 System.out.println(s2.hashCode());
		
		
	//PREVENT SIGLON BREAK USING ENUM
		
//		Samosa samosa=Samosa.INSTANCE;
//		
//		System.out.println(samosa.hashCode());
		
		Samosa samosa=Samosa.getSamosa();
		System.out.println(samosa.hashCode());
//		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abs.ob"));
//		oos.writeObject(samosa);
//		System.out.println("serilization done");
//		
//		ObjectInputStream ois=new ObjectInputStream( new FileInputStream( "abs.ob"));
//		Samosa s2 =(Samosa) ois.readObject();
//		System.out.println(s2.hashCode());
		
		
		//break using clone method
		Samosa s2;
		try {
			s2 = (Samosa) samosa.clone();
			System.out.println(s2.hashCode());

		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
		
		
		
		
		
		
	}
	

}
