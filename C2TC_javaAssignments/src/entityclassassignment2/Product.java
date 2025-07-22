package entityclassassignment2;

public class Product {
	
	    public int productId;
	    public String productName;
	    public int price;

	    public Product(int productId, String productName, int price) {
	        this.productId = productId;
	        this.productName = productName;
	        this.price = price;
	    }

	    public void display() {
	        System.out.println("Product ID: " + productId);
	        System.out.println("Product Name: " + productName);
	        System.out.println("Price: $" + price);
	        System.out.println();
	    }
	
}
