package practice.check.design.observer;

public class JohnObserver implements INotificationObserver {
	
private String name;
	

	public JohnObserver(String name) {
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
	public void onServerDown() {
		System.out.println(name+" the notification has been received");
		
		
	}


	@Override
	public String getObserverName() {
		return this.getName();
	}

}
