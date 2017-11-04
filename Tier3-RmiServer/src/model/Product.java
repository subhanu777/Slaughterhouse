package model;
import java.util.ArrayList;

public abstract class Product {
	
	private int productId;
	private ArrayList<Integer> trays;
	public Product(int productId) {
		this.productId = productId;
		trays = new ArrayList<Integer>();
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", trays=" + trays + "]";
	}
	
}
