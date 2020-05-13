package practice.check.design.abstract_factory;

public class CarClient {

	public static void main(String[] args) {
		CarFactory c = new CarFactory();
System.out.println(c.buildCar(CarType.MICRO, Location.USA));
System.out.println(c.buildCar(CarType.MINI, Location.INDIA));
System.out.println(c.buildCar(CarType.LUXURY, Location.DEFAULT));

		
	}

}
