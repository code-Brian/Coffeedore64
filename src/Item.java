
public class Item {
	public static int index = 0;
	private String name;
	private double price;
	
	public Item(String name, double price) {
		Item.index += 1;
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getIndex() {
		return index;
	}
}
