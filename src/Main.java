import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Shape aShape = new Shape("We like math!", "any material");
		Shape anotherShape = new Shape("We like shapes!", "any material");
		Triangle firstTriangle = new Triangle("I reflect light", "glass", 5, 2);
		Triangle secondTriangle = new Triangle("I reflect light", "glass", 5, 2);
		Rectangle firstRectangle = new Rectangle("I am a yellow rectangle", "steel", 4, 8);
		Rectangle secondRectangle = new Rectangle("I am a blue rectangle", "steel", 4, 8);
		Rectangle thirdRectangle = new Rectangle("I am a rectangle", "glass", 8, 8);

		aShape.getSize();
		anotherShape.getSize();
		firstTriangle.getSize();
		secondTriangle.getSize();
		firstRectangle.getSize();
		secondRectangle.getSize();
		thirdRectangle.getSize();
		System.out.println();

		System.out.println(aShape.toString());
		System.out.println(anotherShape.toString());
		System.out.println(firstTriangle.toString());
		System.out.println(secondTriangle.toString());
		System.out.println(firstRectangle.toString());
		System.out.println(secondRectangle.toString());
		System.out.println(thirdRectangle.toString());
		System.out.println();

		
		System.out.println("Is firstTriangle equal to secondTriangle? Answer: " + firstTriangle.equals(secondTriangle));
		System.out.println("Is firstTriangle equal to firstRectangle? Answer: " + firstTriangle.equals(firstRectangle)); 
		System.out.println("Is firstRectangle equal to secondRectangle? Answer: " 
							+ firstRectangle.equals(secondRectangle)); // Textul nu este luat in considerare
																													
		System.out.println("Is secondRectangle equal to thirdRectangle? Answer: " 
							+ secondRectangle.equals(thirdRectangle));
		System.out.println("Is firstRectangle equal to thirdRectangle? Answer: " 
							+ firstRectangle.equals(thirdRectangle));
		System.out.println();

		
		System.out.println("aShape hashcode: " + aShape.hashCode());
		System.out.println("anotherShape hashcode: " + anotherShape.hashCode());
		System.out.println("firstTriangle hashcode: " + firstTriangle.hashCode());
		System.out.println("secondTriangle hashcode: " + secondTriangle.hashCode());
		System.out.println("firstRectangle hashcode: " + firstRectangle.hashCode());
		System.out.println("secondRectangle hashcode: " + secondRectangle.hashCode());
		System.out.println("thirdRectangle hashcode: " + thirdRectangle.hashCode());
		System.out.println();

		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(aShape);
		shapes.add(anotherShape);
		shapes.add(firstTriangle);
		shapes.add(secondTriangle);
		shapes.add(firstRectangle);
		shapes.add(secondRectangle);
		shapes.add(thirdRectangle);

		for (Shape shape : shapes) {

			System.out.println(shape);
			System.out.println(shape.getSize());
			System.out.println();
		}
		
		for(int i = 0; i < shapes.size(); i++) {
			if (shapes.get(i) instanceof Shape) {
				System.out.println("No method");
			}
		
			if (shapes.get(i) instanceof Triangle) {
				Triangle triangleRef = (Triangle)shapes.get(i);
				triangleRef.displayTriangleHeight();
			}
				
			if (shapes.get(i) instanceof Rectangle) {
				Rectangle rectangleRef = (Rectangle)shapes.get(i);
				rectangleRef.displayRectangleHeight();
			}
		}

	}

}
