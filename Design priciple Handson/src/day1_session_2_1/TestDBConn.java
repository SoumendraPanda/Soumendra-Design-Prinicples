package day1_session_2_1;

public class TestDBConn {

	public static void main(String[] args) {

		DBConn obj1=DBConn.getInstance();
		//DBConn obj1=new DBConn(); since constructor is private we cannot instantiate using new here.
		obj1.showMessage();
		System.out.println(obj1.hashCode());
		
		DBConn obj2=DBConn.getInstance();
		//DBConn obj2=new DBConn();
		obj2.showMessage();
		System.out.println(obj2.hashCode());
		
	}

}
