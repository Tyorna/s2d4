package es;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rndm = new Random();
		Customer cust1 = new Customer(rndm.nextInt(), "Ty", 1);
		Customer cust2 = new Customer(rndm.nextInt(), "Gi", 2);
		Customer cust3 = new Customer(rndm.nextInt(), "Rick", 1);
		List<Customer> customers = new ArrayList<>();
		customers.add(cust1);
		customers.add(cust2);
		customers.add(cust3);
//		Collections.sort(customers, (s1, s2) -> s2.getId() - s1.getId());
		System.out.println(customers.toString());

		Product prod1 = new Product("Il Signore degli anelli, prima edizione", rndm.nextInt(), 240.50, "Books");
		Product prod2 = new Product("FIght Club", rndm.nextInt(), 12.50, "Books");
		Product prod3 = new Product("Body", rndm.nextInt(), 23.00, "Baby");
		Product prod4 = new Product("Biberon", rndm.nextInt(), 13.00, "Baby");
		Product prod5 = new Product("Bavaglio", rndm.nextInt(), 18.00, "Baby");
		Product prod6 = new Product("Maglietta", rndm.nextInt(), 16.00, "Boys");
		Product prod7 = new Product("Jeans", rndm.nextInt(), 26.00, "Boys");

		List<Product> products = new ArrayList<>();
		products.add(prod1);
		products.add(prod2);
		products.add(prod3);
		products.add(prod4);
		products.add(prod5);
		products.add(prod6);
		products.add(prod7);
		

		System.out.println(products.toString());
//		Collections.sort(products, (s1, s2) -> s2.getPrice() - s1.getPrice());
//
		List<Product> resultBooks = products.stream()
				.filter(element -> element.getCategory() == "Books" && element.getPrice() >= 100)
				.collect(Collectors.toList());
		System.out.println(resultBooks.toString());
		resultBooks.forEach(s -> System.out.println(s.getName()));

		List<Product> resultBoys = products.stream().filter(element -> element.getCategory() == "Boys")
				.collect(Collectors.toList());
		System.out.println(resultBoys.toString());
		resultBoys.forEach(s -> s.setPrice(s.getPrice() * 0.9));
		resultBoys.forEach(s -> System.out.println(s.getName() + " " + s.getPrice()));

		List<Product> listOrder = new ArrayList<>();
		listOrder.add(prod3);
		listOrder.add(prod4);
		listOrder.add(prod5);

		Order order1 = new Order(rndm.nextInt(), "Delivered", LocalDate.parse("2023-05-09"), resultBoys);
		Order order2 = new Order(rndm.nextInt(), "Pending", LocalDate.parse("2021-02-01"), resultBooks);
		Order order3 = new Order(rndm.nextInt(), "Shipped", LocalDate.parse("2022-10-09"), products);
		Order order4 = new Order(rndm.nextInt(), "Delivered", LocalDate.parse("2021-03-03"), listOrder);

		List<Order> orders = new ArrayList<>();
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		orders.add(order4);

		System.out.println(orders.toString());

		List<Order> resultBaby = orders.stream().filter(element -> element.getCategory("Baby"))
				.collect(Collectors.toList());
		resultBaby.forEach(s -> System.out.println(s.getId() + " " + s.getStatus()));

//		List<Order> resultTier = orders.stream().filter(element -> element.getTier() == 2)
//				.collect(Collectors.toList());
//		resultTier.forEach(s -> System.out.println(s.getId() + " " + s.getName()));
	}

}
