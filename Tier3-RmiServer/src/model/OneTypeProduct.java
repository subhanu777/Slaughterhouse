package model;

public class OneTypeProduct extends Product{

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
