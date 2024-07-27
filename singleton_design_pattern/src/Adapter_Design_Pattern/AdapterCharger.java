package Adapter_Design_Pattern;

public class AdapterCharger implements AppleCharger{
	private AndroidCharger androidCharger;

	public AdapterCharger(AndroidCharger androidCharger) {
		
		this.androidCharger = androidCharger;
	}

	@Override
	public void chargePhone() {
		androidCharger.chargerAndroidPhone();
		System.out.println("Your Phone is charging with adapter");
		
	}

}
