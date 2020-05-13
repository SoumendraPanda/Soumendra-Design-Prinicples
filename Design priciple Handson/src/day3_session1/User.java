package day3_session1;

public interface User {

	public String getUserName();
	public void receiveMessage(User user,String msg);
	public void sendMesage(String msg);
	
}
