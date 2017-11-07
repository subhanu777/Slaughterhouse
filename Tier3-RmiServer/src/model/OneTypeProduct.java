package model;

import java.io.Serializable;

public class OneTypeProduct extends Product implements Serializable{

	private String partType;
	public OneTypeProduct(int productId,String partType) {
		super(productId);
		this.partType = partType;
	}
	@Override
	public String toString() {
		return "OneTypeProduct [partType=" + partType + "]";
	}

}
