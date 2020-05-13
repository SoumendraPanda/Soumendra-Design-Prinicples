package day3_session2;

public class TestObserver {

	public static void main(String[] args) {

		MessageSubscriberOne s1 = new MessageSubscriberOne();
		MessageSubscriberTwo s2 = new MessageSubscriberTwo();
		MessageSubscriberThree s3 = new MessageSubscriberThree();

		MessagePublisher p = new MessagePublisher();
		String updatedState=null;

		p.attach(s1);
		p.attach(s2);
		p.attach(s3);
		
		updatedState=p.changeStateOfSubject("First Video Uploaded");
		p.notifyUpdate(new Message(updatedState)); //s1,s2 and s3 will receive the update
		
		p.detach(s1);
		
		updatedState=p.changeStateOfSubject("Second Video Uploaded");
		p.notifyUpdate(new Message(updatedState)); //s2 and s3 will receive the update
	}

}
