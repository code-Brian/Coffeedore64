import java.util.ArrayList;

public class Order {
	private String name;
	private boolean ready;
	private ArrayList<Item> items;
	
	// Constructors
	// No args, sets name to "Guest", initializes items as an empty list;
	public Order() {
		this.name = "Guest";
		this.items = new ArrayList<Item>();
	}
	
	// OVERLOAD 
	// Takes name as arg, sets name to custom name
	// Inits items as empty list
	public Order(String name) {
		this.name = name;
		this.items = new ArrayList<Item>();
	}
	
	// Order methods
	public void getStatusMessage() {
		boolean isReady = getReady();
		if (isReady) {
			System.out.println("Hey, " + getName() + "." + " Your order is ready!");
		} else {
			System.out.println("Sowwy, " + getName() + "." + " No order just yet!");
		}
	}
	
	public double getOrderTotal() {
		double orderTotal = 0.0;
		for(int i = 0; i < this.items.size(); i++) {
			orderTotal += this.items.get(i).getPrice();
		}
		return orderTotal;
	}
	
	public void display() {
		System.out.println("Customer name: " + name);
		for (int i = 0; i < items.size(); i++) {
			System.out.println(items.get(i).getName() + " - " + items.get(i).getPrice());
		}
		System.out.println("Total: " + getOrderTotal() + "\n");
	}
	
	// Setters n getters (I'm a real set and go-getter!)
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setReady(boolean ready) {
		this.ready = ready;
	}
	public boolean getReady() {
		return ready;
	}
	
//	public void setItems(Item item) {
//		this.items.add(item);
//	}
	
	// Setter-ish?
	public void addItem(Item item) {
		items.add(item);
	}
	public ArrayList<Item> getItems() {
		return items;
	}
}
