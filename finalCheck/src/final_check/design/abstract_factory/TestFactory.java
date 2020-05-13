package final_check.design.abstract_factory;

public class TestFactory {

	public static void main(String[] args) {

		FactoryProducer fp=new FactoryProducer();
		Order category = fp.getOrderCategory("electric");
		category.processOrder();
	}

}
