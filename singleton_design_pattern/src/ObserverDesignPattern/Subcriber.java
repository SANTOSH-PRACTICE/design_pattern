package ObserverDesignPattern;

public class Subcriber implements Observer{
	String name;
	public Subcriber(String name) {
		this.name=name;
	}

	public void notified(String title) {
		System.err.println("Hello "+this.name+"   new video upload : "+title);
		
	}

	

}
