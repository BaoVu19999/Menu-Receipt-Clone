import java.text.DecimalFormat;

public class CannedFood extends GrocItem{
	private int size;
	public CannedFood(String name, double price, int qty, boolean perishable, int size) {
		super(name, price, qty, perishable);
		// TODO Auto-generated constructor stub
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("$#,###.##");
		return "CannedFood   \n"
				+ getName() + "  "
				+ df.format(getPrice())  + "  "
				+ getQty() + "  "
				+ df.format(totalPrice()) + "  "
				+ size + "\t"
				+ ((super.isPerishable()) ? "perishable" : "non-perishable") ;
	}

	
	
	
	


	
	
	
}
