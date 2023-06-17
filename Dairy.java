import java.text.DecimalFormat;

public class Dairy extends GrocItem {
	private String expireDate;

	public Dairy(String name, double price, int qty, boolean perishable, String expireDate) {
		super(name, price, qty, perishable);
		this.expireDate = expireDate;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("$#,###.##");
		return "Dairy" + "\n"
				+ getName() + " " 
				+ df.format(getPrice()) + "    "
				+ getQty() + "   "
				+ df.format(totalPrice()) + "  "
				+ ((super.isPerishable()) ? "perishable" : "non-perishable") + "  "
			    + expireDate ;
	}

}
