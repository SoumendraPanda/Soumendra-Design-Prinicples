package final_check.design.abstract_factory;

public class FactoryProducer extends AbstractFactory {

	@Override
	public Order getOrderCategory(String category) {
		if(category.equalsIgnoreCase("Electric")) {
			return new ElectricOrder();
		}else if(category.equalsIgnoreCase("Furniture")) {
			return new FurnitureOrder();
		}else if(category.equalsIgnoreCase("Toys")) {
			return new ToysOrder();
		}
		
		
		return null;
	}

}
