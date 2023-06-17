
public  abstract class Item {
	public double TaxRate = 0.07525;
	private String name;
	private double price;
	private int qty;
	
	public Item(String name, double price, int qty) {
		
		this.name = name;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
	public double totalPrice() {
		return price * qty;
	}

	public int getQty() {
		return qty;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double calcTax() {
		double total = 0;
		 total = (price * TaxRate) * qty;
		 
		 return total;
	}

	
	  @Override public String toString() { return TaxRate + ", name=" + name + ", "
	  + "price=" + price + ", qty=" + qty ; }
	 
	
	public boolean equals(Object other) {
		if (other instanceof Item) {
			Item otherContestant = (Item) other;
			if (this.name.equalsIgnoreCase(otherContestant.name)) {

				return true;
			}
		}
		return false;
	}
}
