package final_check.design.observer;

public interface NotificationObserver {
	
	public String getObserverName();
	
	public void onHundredBooked();
	
	public void subscribeToNotification(NotificationService ns);
	public void unsubscribeToNotification(NotificationService ns);
	

}
