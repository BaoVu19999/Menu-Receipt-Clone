import java.text.DecimalFormat;

public class Receipt {

	private Item[] purchases;
	private int numPurchases;

	/**
	 * instantiates a BookBag with a given capacity
	 * 
	 * @param capacity -- required BookBag's capacity
	 */
	public Receipt(int capacity) {
		this.purchases = new Item[capacity];
		this.numPurchases = 0;
	}

	/**
	 * 
	 * @param Item --value add to the purchases
	 */
	public void add(Item nextItem) {
		purchases[numPurchases++] = nextItem;

		// same as purchases[numPurchases] = Item;
		// numPurchases++;
	}
	/*
	 * public boolean addItem(String name, double price, int quantity) { for (int i
	 * = 0; i < this.items.length; i++) { if (this.items[i] == null) { this.items[i]
	 * = new MenuItem(name, price, quantity); this.numItems++; return true; }
	 * 
	 * else if (this.items[i].getName().equals(name)) {
	 * this.items[i].setQuantity(this.items[i].getQuantity() + quantity); return
	 * true; } }
	 * 
	 * return false; }
	 */


	public double totalBeforeTax() {
		double total = 0;

		for (int i = 0; i < this.numPurchases; i++) {
			total += this.purchases[i].totalPrice();
		}

		return total;

	}

	public double totalTax() {
		double total = 0;
        
        for (int i = 0; i < this.numPurchases; i++) {
                total += this.purchases[i].calcTax();
        }
        
        return total;
	}
	
	public String toString() {
		String result = "";
		DecimalFormat df = new DecimalFormat("$#,###.##");
        int quantities = 0;
		for(int i = 0; i < this.numPurchases; i++) {
			result += this.purchases[i].toString() + "\n";
            quantities += purchases[i].getQty();
		}
		result += "-----------------------------------\n";
			
			
			result += "Before tax: " + df.format(totalBeforeTax()) + "\n";
			result += "Tax: " + df.format(totalTax()) + "\n";
			result += "Total: " + df.format(totalTax() + totalBeforeTax()) + "\n";
			result +=  "Number of items: " + quantities ;
			
			
		return result;
	
	}


	
	}

