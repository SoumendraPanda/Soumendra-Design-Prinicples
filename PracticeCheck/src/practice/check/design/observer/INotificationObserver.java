package practice.check.design.observer;

public interface INotificationObserver {
	public String getObserverName();
	public void onServerDown();

}
