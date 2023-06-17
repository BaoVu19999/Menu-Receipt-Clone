import java.text.DecimalFormat;

public class Clothing extends Item{

	private char size;
	private String color;
	
	public Clothing(String name, double price, int qty, char size, String color ) {
		super(name, price, qty);
		this.size = size;
		this.color = color;
	}

	public char getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("$#,###.##");
		return "Clothing \n" 
				+ getName() + "  "
				+ df.format(getPrice()) + "  "
				+  getQty() + "  "
				+ df.format(totalPrice()) + "  "
				+ size + "  "
				+ color ;
	}

	
	
	
}
