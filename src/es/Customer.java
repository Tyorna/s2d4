package es;

public class Customer {
	private int id;
	private String name;
	private int tier;

	public Customer(int id, String name, int tier) {

		this.setId(id);
		this.setName(name);
		this.setTier(tier);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTier() {
		return tier;
	}

	public void setTier(int tier) {
		this.tier = tier;
	}

	@Override
	public String toString() {
		return "Customer [ id= " + id + ", name=" + name + ", tier=" + tier + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Customer s = (Customer) obj;
		if (this.name == s.name && this.id == s.id && this.tier == s.tier) {
			return true;
		} else {
			return false;
		}
	}
}
