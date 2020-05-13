package day1_session_2_2;

public class MercedesFactory extends Factory {
	
	public  Headlight makeHeadlight() {
		return new MercedesHeadlight();
		
	}
	public Tire makeTire() {
		return new MercedesTire();
		
	}

}
