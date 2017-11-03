package model;

import java.util.ArrayList;

public abstract class Product {
	
	private int productId, trayId;
	private ArrayList<AnimalPart> animalParts;
	public Product(int productId, int trayId) {
		this.productId = productId;
		this.trayId = trayId;
		animalParts = new ArrayList<AnimalPart>();
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getTrayId() {
		return trayId;
	}
	public void setTrayId(int trayId) {
		this.trayId = trayId;
	}
	public ArrayList<AnimalPart> getAnimalParts() {
		return animalParts;
	}
	public void setAnimalParts(ArrayList<AnimalPart> animalParts) {
		this.animalParts = animalParts;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", trayId=" + trayId + ", animalParts=" + animalParts + "]";
	}
	
	
	
	
	

	
	
}
