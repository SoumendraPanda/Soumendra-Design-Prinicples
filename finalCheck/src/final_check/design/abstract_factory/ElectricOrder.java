package final_check.design.abstract_factory;

public class ElectricOrder extends Order {

	@Override
	public void processOrder() {
		System.out.println("Inside Electric Order");
	}

}
