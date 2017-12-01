package model;

import java.io.Serializable;

public class Animal implements Serializable{

	private int animalId;
	private double weight;
	public Animal(int animalId, double weight) {

		this.animalId = animalId;
		this.weight = weight;
	}
	public Animal(double weight) {

		this.animalId = 0;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Animal [animalId=" + animalId + ", weight=" + weight + "]";
	}
	
	
}
