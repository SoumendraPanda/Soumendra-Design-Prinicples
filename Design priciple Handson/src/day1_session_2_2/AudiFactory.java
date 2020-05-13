package day1_session_2_2;

public class AudiFactory extends Factory {
	
	public  Headlight makeHeadlight() {
		return new AudiHeadlight();
		
	}
	public Tire makeTire() {
		return new AudiTire();
		
	}

}
