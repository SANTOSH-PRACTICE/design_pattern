package Adapter_Design_Pattern;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Program started");
		
		//iphone charger
	//	AppleCharger chrger=new ChargerXYZ();
		
		AppleCharger chrger= new AdapterCharger(new DKCharger());

		
		Iphone13 iphone13=new Iphone13(chrger);
		iphone13.chargeIphone();
		
	}

}
