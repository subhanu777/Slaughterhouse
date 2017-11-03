package model;

public class AnimalPart {

	private int partId,animalId;
	private double weight;
	private String partType;
	public AnimalPart(int partId, int animalId, double weight, String partType) {
		super();
		this.partId = partId;
		this.animalId = animalId;
		this.weight = weight;
		this.partType = partType;
	}
	public int getPartId() {
		return partId;
	}
	public void setPartId(int partId) {
		this.partId = partId;
	}
	public int getAnimalId() {
		return animalId;
	}
	public void setAnimalId(int animalId) {
		this.animalId = animalId;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getPartType() {
		return partType;
	}
	public void setPartType(String partType) {
		this.partType = partType;
	}
	@Override
	public String toString() {
		return "AnimalPart [partId=" + partId + ", animalId=" + animalId + ", weight=" + weight + ", partType="
				+ partType + "]";
	}
}
