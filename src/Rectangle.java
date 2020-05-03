
public class Rectangle extends Shape {

	private int width;
	private int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(String text, String material, int width, int height) {
		super(text, material);
		this.width = width;
		this.height = height;
	}

	public void displayRectangleHeight() {
		System.out.println("Rectangle height is: " + height);
	}

	@Override
	public double getSize() {
		double area = width * height;
		System.out.print("The area of the rectangle is: ");
		return area;
	}

	@Override
	public String toString() {
		return "Rectangle: height is " + height + ", width is : " + width + " made of " + super.getMaterial()
				+ ", contains the text " + super.getText();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (!super.equals(obj))
			return false;

		if (getClass() != obj.getClass())
			return false;

		Rectangle rectangleObj = (Rectangle) obj;
		if (height != rectangleObj.height)
			return false;
		if (width != rectangleObj.width)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + height;
		result = prime * result + width;
		return result;
	}

}
