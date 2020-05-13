package day3_session1;

import java.util.Date;

public class BasicUser implements User {
	private String name;
	private ChatMediator chatMediator=new ChatMediatorClass();
	

	public BasicUser(String name) {
		super();
		this.name = name;
		
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void receiveMessage(User user, String msg) {

		System.out.println(new Date().toString()+" "+user.getUserName()+":"+msg);
		
	}

	@Override
	public void sendMesage(String msg) {
		
		chatMediator.sendMessage(this,msg);
	}


	@Override
	public String getUserName() {
		return this.getName();
	}

}
