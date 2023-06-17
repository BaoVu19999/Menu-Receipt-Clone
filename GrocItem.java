
public class GrocItem extends Item {
	private boolean perishable;

	public GrocItem(String name, double price, int qty, boolean perishable) {
		super(name, price, qty);
		this.perishable = perishable;
	}

	public boolean isPerishable() {
		return perishable;
	}

	public void setPerishable(boolean perishable) {
		this.perishable = perishable;

	}

	@Override
	public String toString() {
		if (perishable)
			return super.toString() + "\tperisable";
		else
			return super.toString() + "non-perishable";
	}

}
