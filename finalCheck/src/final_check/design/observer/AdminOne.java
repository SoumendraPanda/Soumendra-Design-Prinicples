package final_check.design.observer;

public class AdminOne implements NotificationObserver {
	
	
private String name;

	
	public AdminOne(String name) {
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
	public String getObserverName() {
		return this.getName();
	}

	@Override
	public void onHundredBooked() {

		System.out.println(this.getName()+" Hundred bookings!!");
	}

	@Override
	public void unsubscribeToNotification(NotificationService ns) {
		ns.removeSubscriber(this);
		
	}

	@Override
	public void subscribeToNotification(NotificationService ns) {
		ns.addSubscriber(this);
	}

	
}
