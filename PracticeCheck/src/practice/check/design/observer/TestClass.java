package practice.check.design.observer;

public class TestClass {

	public static void main(String[] args) {

		SteveObserver steve = new SteveObserver("Steve");
		
		JohnObserver john = new JohnObserver("John");
		
		INotificationService service= new NotificationService();
		service.addSubscriber(steve);
		service.addSubscriber(john);
		service.notifySubscriber();
		service.removeSubscriber(john);
	}

}
