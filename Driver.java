
public class Driver {
	 public static void main(String [] args) {
		 Receipt receipt1 = new Receipt(25);
		 
		 
		 Item item1 = new Dairy("Milk", 2.49, 1, true,  "1/20/21") ;
		 Item item2 = new CannedFood("Tuna", 1.50, 2, true, 3);
		 Item item3 = new Clothing("Pants", 19.99, 2, 'M', "Gray");
		 Item item4 = new Housewares("Pan", 14.99, 1, "non-stick");
		 Item item5 = new Housewares("Pan", 14.99, 3, "non-stick");
		 Item item6 = new Dairy("Yogurt", 2.99, 4, true,  "1/2/21") ;
		 Item item7 = new CannedFood("Spam", 1.50, 2, true, 1);
		 Item item8 = new Clothing("Hat", 19.99, 1, 'M', "Blue");
		 Item item9 = new Housewares("Blanket", 49.99, 5, "cotten");
		 Item item10 = new Housewares("chairs", 25.99, 1, "Wood");
		 Item item11 = new Dairy("Butter", 1.99, 1, true,  "1/27/21") ;
		 Item item12 = new CannedFood("Cranberry sauce", 1.20, 1, true, 3);
		 Item item13 = new Clothing("Jacket", 39.99, 1, 'M', "Black");
		 Item item14 = new Housewares("Table", 49.99, 1, "Wood");
		 Item item15 = new Housewares("Pan", 14.99, 1, "non-stick");
		 Item item16 = new Dairy("Cheese", 2.79, 1, true,  "1/10/21") ;
		 Item item17 = new CannedFood("Green Pea", 1.75, 4, true, 2);
		 Item item18 = new Clothing("shirt", 19.99, 6, 'M', "white");
		 Item item19 = new Housewares("plunger", 10.99, 1, "Rubber");
		 Item item20 = new Housewares("Pillows", 9.99, 3, "cotton");
		 Item item21 = new Dairy("Cream", 3.99, 1, true,  "12/20/21") ;
		 Item item22 = new CannedFood("Chicken Noodle", 1.99, 2, true, 5);
		 Item item23 = new Clothing("T-shirt", 19.99, 5, 'L', "white");
		 Item item24 = new Housewares("Knife set", 29.99, 1, "real metal");
		 Item item25 = new Housewares("Dish Towels", 14.99, 1, "white");
	
		 receipt1.add(item1);
		 receipt1.add(item2);
		 receipt1.add(item3);
		 receipt1.add(item4);
		 receipt1.add(item5);
		 receipt1.add(item6);
		 receipt1.add(item7);
		 receipt1.add(item8);
		 receipt1.add(item9);
		 receipt1.add(item10);
		 receipt1.add(item11);
		 receipt1.add(item12);
		 receipt1.add(item13);
		 receipt1.add(item14);
		 receipt1.add(item15);
		 receipt1.add(item16);
		 receipt1.add(item17);
		 receipt1.add(item18);
		 receipt1.add(item19);
		 receipt1.add(item20);
		 receipt1.add(item21);
		 receipt1.add(item22);
		 receipt1.add(item23);
		 receipt1.add(item24);
		 receipt1.add(item25);
		System.out.println(receipt1.toString());
	 }
}
