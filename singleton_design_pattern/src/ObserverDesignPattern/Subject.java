package ObserverDesignPattern;

public interface Subject {
	void subcribe(Observer ob);
	void unSubcribe(Observer ob);
	void newVideoUploaded(String title);
	

}
