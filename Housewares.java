import java.text.DecimalFormat;

public class Housewares extends Item {
	private String material;
	
	public Housewares(String name, double price, int qty, String material) {
		super(name, price, qty);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	

		@Override
	public String toString() {
	DecimalFormat df = new DecimalFormat("$#,###.##");
		return "Housewares \n"
				+ getName() + "  "
				+ df.format(getPrice()) + " "
				+ getQty()  + "  "
				+ df.format(totalPrice()) + "   "
				+ material + "\n";
				
	
	}

		public double calcTax() {
			double total = 0;
			 total = (getPrice() * TaxRate) * getQty();
			 
			 return total;
		}
	}
	

	

