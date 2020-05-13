package final_check.design.observer;

public class TestObserverClass {

	public static void main(String[] args) {
NotificationObserver one=new AdminOne("Ram");
NotificationObserver two=new AdminTwo("Shyam");
NotificationService ns=new NotificationServiceImpl();
one.subscribeToNotification(ns);
two.subscribeToNotification(ns);
ns.notifySubscriber();
one.unsubscribeToNotification(ns);
ns.notifySubscriber();
		
		
	}

}
