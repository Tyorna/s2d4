package es;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Order {

	private int id;
	private String status;
	LocalDate orderDate = LocalDate.now();
	LocalDate deliveryDate = orderDate.plusDays(3);
	List<Product> products = new ArrayList<>();

	public Order(int id, String status, LocalDate orderDate, List<Product> prodotti) {

		this.setId(id);
		this.setStatus(status);
		this.orderDate = orderDate;
		this.deliveryDate = orderDate.plusDays(5);
		this.products = prodotti;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Product> getCategory(String categ) {
		return products.stream().filter(element -> element.getCategory().equals(categ)).collect(Collectors.toList());
	}


	@Override
	public String toString() {
		return "Order [status=" + status + ", id=" + id + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate
				+ ", products=" + products + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Order s = (Order) obj;
		if (this.id == s.id && this.status == s.status && this.orderDate == s.orderDate
				&& this.products == s.products) {
			return true;
		} else {
			return false;
		}
	}
}
