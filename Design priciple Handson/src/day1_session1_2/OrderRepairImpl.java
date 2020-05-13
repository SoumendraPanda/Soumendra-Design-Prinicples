package day1_session1_2;

public class OrderRepairImpl implements OrderRepair {

	@Override
	public void processOrder(String modelName) {
		System.out.println("Accessory of model "+modelName+" repair order placed");

	}

	@Override
	public void processAccessoryRepair(String accessoryType) {
		System.out.println("Accessory of type "+accessoryType+"  placed");

	}

}
