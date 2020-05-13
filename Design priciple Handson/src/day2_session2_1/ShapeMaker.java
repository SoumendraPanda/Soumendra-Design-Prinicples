package day2_session2_1;

public class ShapeMaker {
	
	private Shape circle;
	private Shape rectangle;
	private Shape square;
	public ShapeMaker() {
		super();
	}
	
	public void drawCircle() {
		circle=new Circle();
		circle.draw();
		
	}
	public void drawReactangle() {
		rectangle=new Rectangle();
		rectangle.draw();
		
	}
	public void drawSquare() {
		square= new Square();
		square.draw();
		
	}

}
