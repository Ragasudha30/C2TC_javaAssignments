package entityclassassignment2;

public class ProductDetails {

	public static void main(String[] args) {
		    ProductDemo p1 = new ProductDemo(1, "Laptop", 75000);
	        ProductDemo p2 = new ProductDemo(2, "Mobile", 20000);
	        ProductDemo p3 = new ProductDemo(3, "Tablet", 15000);
	        ProductDemo p4 = new ProductDemo(4, "Monitor", 12000);

	        System.out.println("Product Details:");
	        p1.display();
	        p2.display();
	        p3.display();
	        p4.display();
	}

}
