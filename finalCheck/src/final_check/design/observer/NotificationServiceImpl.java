package final_check.design.observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationServiceImpl implements NotificationService {

	public List<NotificationObserver> list=new ArrayList<>();
	
	@Override
	public void addSubscriber(NotificationObserver no) {
		list.add(no);

	}

	@Override
	public void removeSubscriber(NotificationObserver no) {
		list.remove(no);
	}

	@Override
	public void notifySubscriber() {
		for(NotificationObserver o:list) {
			o.onHundredBooked();
		}
	}

}
