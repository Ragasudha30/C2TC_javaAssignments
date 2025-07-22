package entityclassassignment2;

public class ProductDemo {

	public static void main(String[] args) {
		    Product p1 = new Product(1, "Laptop", 75000);
	        Product p2 = new Product(2, "Mobile", 20000);
	        Product p3 = new Product(3, "Tablet", 15000);
	        Product p4 = new Product(4, "Monitor", 12000);

	        System.out.println("Product Details:");
	        p1.display();
	        p2.display();
	        p3.display();
	        p4.display();
	}

}
