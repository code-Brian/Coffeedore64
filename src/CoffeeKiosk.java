import java.util.ArrayList;

public class CoffeeKiosk {
	private ArrayList<Item> menu;
	private ArrayList<Order> orders;
	
	public CoffeeKiosk() {
		this.menu = new ArrayList<Item>();
		this.orders = new ArrayList<Order>();
	}
	
	public void addMenuItem(String name, double price) {
		Item menuItem = new Item(name, price);
		menu.add(menuItem);
	}
	
	public void displayMenu() {
		for (int i = 0; i < menu.size(); i++) {	
			System.out.println(menu.get(i).getIndex() + " " + menu.get(i).getName() + " -- " + menu.get(i).getPrice());
		}
	}
	
	public void newOrder() {
		System.out.println("Please enter the customer name for the new order...");
		String name = System.console().readLine();
		Order newOrder = new Order(name);
		
		System.out.println("Please enter a menu item or q to quit...");
		String itemNumber = System.console().readLine();
		
		while(!itemNumber.equals("q")) {
			newOrder.addItem(itemNumber));
		}
		
		newOrder.display();
	}
}


