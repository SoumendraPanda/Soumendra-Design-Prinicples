package practice.check.design.abstract_factory;

public class CarFactory extends AbstractFactory {

	@Override
	public Car buildCar(CarType type, Location location) {

		if (type.equals(CarType.MICRO)) {
			return new MicroCar(location);
		} else if (type.equals(CarType.MINI)) {
			return new MiniCar(location);
		} else if (type.equals(CarType.LUXURY)) {
			return new LuxuryCar(location);
		}
		return null;
	}

}
