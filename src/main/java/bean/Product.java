package bean;

public class Product {

	private String name;
	private double price;

	public Product(String aName, double aPrice) {
		name = aName;
		price = aPrice;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setName(String val) {
		name = val;
	}

	public void setPrice(double val) {
		price = val;
	}

	public String getNameAndPrice() {
		return "Name: " + getName() + " Price: " + getPrice();
	}
}
