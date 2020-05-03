
public class Triangle extends Shape {

	private int base;
	private int height;

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	public Triangle(String text, String material, int base, int height) {
		super(text, material);
		this.base = base;
		this.height = height;
	}

	public void displayTriangleHeight() {
		System.out.println("Triangle height is: " + height);
	}

	@Override
	public double getSize() {
		double area = base * height / 2;
		System.out.print("The area of the triangle is: ");
		return area;
	}

	@Override
	public String toString() {
		return "Triangle: height is " + height + ", base is : " + base + " made of " + super.getMaterial()
				+ ", contains the text " + super.getText();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + base;
		result = prime * result + height;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (!super.equals(obj))
			return false;

		if (getClass() != obj.getClass())
			return false;

		Triangle triangleObj = (Triangle) obj;
		if (base != triangleObj.base)
			return false;
		if (height != triangleObj.height)
			return false;
		return true;
	}

}
