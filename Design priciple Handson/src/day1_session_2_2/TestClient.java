package day1_session_2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestClient {

	public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter brand name 'audi' or 'mercedes'");
String brand=br.readLine().trim();
if(brand.equalsIgnoreCase("audi")) {
		AudiFactory af=new AudiFactory();
		Tire at=af.makeTire();
		Headlight ah=af.makeHeadlight();
		at.insideTire();
		ah.insideHeadlight();
		
	}else {
		MercedesFactory mf=new MercedesFactory();
		Tire mt=mf.makeTire();
		Headlight mh=mf.makeHeadlight();
		mt.insideTire();
		mh.insideHeadlight();
	}
	}

}
