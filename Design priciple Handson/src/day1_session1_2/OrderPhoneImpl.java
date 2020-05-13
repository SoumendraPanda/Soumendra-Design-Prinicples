package day1_session1_2;

public class OrderPhoneImpl implements OrderPhone {

	@Override
	public void processOrder(String modelName) {
		System.out.println("Phone of model "+modelName+" placed");

	}

}
