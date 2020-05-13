package practice.check.design.observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {
	List<INotificationObserver> list = new ArrayList<>();

	@Override
	public void addSubscriber(INotificationObserver no) {
		list.add(no);
		for (INotificationObserver o : list) {
			System.out.println(o.getObserverName());
		}

	}

	@Override
	public void removeSubscriber(INotificationObserver no) {
		list.remove(no);
		for (INotificationObserver o : list) {
			System.out.println(o.getObserverName());
		}

	}

	@Override
	public void notifySubscriber() {
		for(INotificationObserver o:list) {
			o.onServerDown();
		}

	}

}
