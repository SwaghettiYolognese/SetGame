package setClasses;
public class Card {
	// card attributes
	private Integer color;
	private Integer shape;
	private Integer number;
	private Integer shading;

	public int getColor() {
		return color.intValue();
	}

	public int getShape() {
		return shape.intValue();
	}

	public int getNumber() {
		return number.intValue();
	}

	public int getShading() {
		return shading.intValue();
	}

	public Card(int color, int shape, int number, int shading) {
		this.color = color;
		this.shape = shape;
		this.number = number;
		this.shading = shading;
	}

	public void printCard() {
		String encoding = color.toString() + shape.toString()
				+ number.toString() + shading.toString() + " ";
		System.out.print(encoding);
	}
}