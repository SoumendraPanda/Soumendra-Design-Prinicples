package practice.check.design.observer;

public interface INotificationService {
	public void addSubscriber(INotificationObserver no);
	public void removeSubscriber(INotificationObserver no);
	public void notifySubscriber();

}
