package day2_session_1_1;

public abstract class Burger implements Item {

	
	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
