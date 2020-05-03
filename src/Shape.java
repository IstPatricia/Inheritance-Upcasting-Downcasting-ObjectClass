
public class Shape {

	private String text;
	private String material;

	public Shape() {

	}

	public Shape(String text, String material) {
		this.text = text;
		this.material = material;
	}
	
	
	public String getText() {
		return text;
	}

	public String getMaterial() {
		return material;
	}


	public double getSize() {
		System.out.print("Error: Cannot calculate the area of a generic object: ");
		return -1;
	}

	@Override
	public String toString() {
		return "Made of " + material + ", contains the text: " + text;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Shape shapeObj = (Shape) obj;
		if (material == null) {
			if (shapeObj.material != null)
				return false;
			
		} else if (!material.equals(shapeObj.material))
			return false;
		
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		return result;
	}
	
}
