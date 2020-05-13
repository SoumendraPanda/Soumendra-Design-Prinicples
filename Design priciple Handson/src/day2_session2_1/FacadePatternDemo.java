package day2_session2_1;

public class FacadePatternDemo {
	
	public static void main(String args[]) {
		ShapeMaker maker=new ShapeMaker();
		maker.drawCircle();
		maker.drawReactangle();
		maker.drawSquare();
	}

}
