package model;

public class Animal {

	private int animalId, meetQuality;
	private String animalType,owner;
	private double weight;
	public Animal(int animalId, int meetQuality, String animalType, String owner, double weight) {
		super();
		this.animalId = animalId;
		this.meetQuality = meetQuality;
		this.animalType = animalType;
		this.owner = owner;
		this.weight = weight;
	}
	public int getAnimalId() {
		return animalId;
	}
	public void setAnimalId(int animalId) {
		this.animalId = animalId;
	}
	public int getMeetQuality() {
		return meetQuality;
	}
	public void setMeetQuality(int meetQuality) {
		this.meetQuality = meetQuality;
	}
	public String getAnimalType() {
		return animalType;
	}
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Animal [animalId=" + animalId + ", meetQuality=" + meetQuality + ", animalType=" + animalType
				+ ", owner=" + owner + ", weight=" + weight + "]";
	}
}
