package ai.jobiak.core;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = Product.builder()
				.productId(101)
				.description("Coke")
				.price(25.00)
				.build();
		System.out.println(p);


	}

}
