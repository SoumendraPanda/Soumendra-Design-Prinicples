package day1_session1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestOrderRepair {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 'order' or 'repair'");
		String option=br.readLine().toLowerCase();
		String modelName="";
		switch(option) {
		case "order":
			Order orderPhone=new OrderPhoneImpl();
			System.out.println("Please provide the phone model");
			 modelName=br.readLine().trim().toLowerCase();
			orderPhone.processOrder(modelName);
			break;
		case "repair":
			Order orderRepair=new OrderRepairImpl();
			System.out.println("Phone or accessory repair?");
			String productType=br.readLine().trim().toLowerCase();
		if(productType.equals("phone")) {
			System.out.println("Please provide the phone model");
			 modelName=br.readLine().trim().toLowerCase();
			 orderRepair.processOrder(modelName);
		}else {
			System.out.println("Please provide the accessory type");
			 String accessoryType=br.readLine().trim().toLowerCase();
			 ((OrderRepairImpl) orderRepair). processAccessoryRepair( accessoryType);
		}
		}
	}

}
