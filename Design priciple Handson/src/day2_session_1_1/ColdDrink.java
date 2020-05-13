package day2_session_1_1;

public abstract class ColdDrink implements Item {

	

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	@Override
	public abstract float price();

}
