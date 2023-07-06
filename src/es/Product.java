package es;

public class Product {
	private String name;
	private long id;
	private double price;
	private String category;

	public Product(String name, long id, double price, String category) {

		this.setName(name);
		this.setId(id);
		this.setPrice(price);
		this.setCategory(category);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {

		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", price=" + price + ", category=" + category + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Product s = (Product) obj;
		if (this.name == s.name && this.id == s.id && this.category == s.category) {
			return true;
		} else {
			return false;
		}
	}
}
