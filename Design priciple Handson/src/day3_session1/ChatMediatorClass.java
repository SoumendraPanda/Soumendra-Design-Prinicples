package day3_session1;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorClass implements ChatMediator {

	private static  List<User> list=new ArrayList<>();
	
	
	
	public ChatMediatorClass() {
		super();
		
	}

	@Override
	public void addUser(User user) {

		if(!list.contains(user)) {
			list.add(user);
		}
	}

	@Override
	public  void sendMessage(User user,String msg) {
		
		for(User u:list) {
			if(u.equals(user)) {
				continue;
			}else {
				u.receiveMessage(user, msg);
			}
		}
	}

}
