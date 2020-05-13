package final_check.design.observer;

public interface NotificationService {
	
	public void addSubscriber(NotificationObserver no);
	public void removeSubscriber(NotificationObserver no);
	public void notifySubscriber();

}
