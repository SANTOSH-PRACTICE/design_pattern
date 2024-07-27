package singleton_design_pattern;

import java.io.Serializable;

import javax.management.RuntimeErrorException;

public class Samosa implements Serializable, Cloneable{
	
	//second method is prevent break singleton pattern
//	public enum Samosa {
//		INSTANCE;
//		
//		public void  test()
//		{
//			System.out.println("test methods");
//		}
		
		
	

	private static Samosa samosa;
//	//Constructor
//	
//	
//	private Samosa()
//	{
//		//first method to prevent break singleton
//		if(samosa!=null)
//		{
//			throw new RuntimeException("You are trying to break singleton pattern");
//		}
//	}
//	//Lazy way of creating single object
//	/*method synchronize
//	 * public synchronized static Samosa getSamosa() { //object of this class
//	 * //Samosa samosa=new Samosa(); if(samosa==null) { samosa=new Samosa(); }
//	 * return samosa; }
//	 */
////block synchonize
//	public  static Samosa getSamosa()
//	{
//		//object of this class
//		if(samosa==null)
//		{
//			synchronized (Samosa.class) {
//				if(samosa==null)
//				{
//					samosa=new Samosa();
//				}
//				
//			}
//			
//		}
//		return samosa;
//	}
//}
//  
//// 1. constructor private
//// 2.object create with the help of method
//// 3. create field to store oblect is private
//

	
	public  static Samosa getSamosa()
	{
		//object of this class
		if(samosa==null)
		{
			synchronized (Samosa.class) {
				if(samosa==null)
				{
					samosa=new Samosa();
				}
				
			}
			
		}
		return samosa;
	}
	public Object  readResolve()
	{
		return samosa;
	}
	@Override
	public Object  clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
