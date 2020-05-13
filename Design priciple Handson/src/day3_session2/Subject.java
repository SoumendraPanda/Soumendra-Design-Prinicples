package day3_session2;

public interface Subject {
	
	public void attach(Observer o);
	public void detach(Observer o);
	public void notifyUpdate(Message m);

}
