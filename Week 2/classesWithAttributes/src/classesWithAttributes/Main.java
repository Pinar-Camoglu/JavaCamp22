package classesWithAttributes;

public class Main {

	public static void main(String[] args) {

		Product product = new Product(1, "Laptop", "Lenovo Thinkbook", 17987, 5, "Uzay Grisi");
		
		product.setName("Laptop");
		product.setId(3);
		product.setDescription("Lenovo Thinkbook");
		product.setPrice(17987);
		product.setStockAmount(5);
		product.setColor("Uzay Grisi");
		
		System.out.println(product.getDescription());
		System.out.println(product.getColor());
		System.out.println(product.getPrice());
		System.out.println(product.getCode());

	}

}
