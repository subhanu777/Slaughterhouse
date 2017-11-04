package model;

public class Animal {

	private int animalId;
	private double weight;
	public Animal(int animalId, double weight) {

		this.animalId = animalId;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Animal [animalId=" + animalId + ", weight=" + weight + "]";
	}
	
	
}