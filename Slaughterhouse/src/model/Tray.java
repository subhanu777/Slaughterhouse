package model;

import java.util.ArrayList;

public class Tray {

	private int trayId;
	private double maxWeight, currentWeight;
	private String trayType;
	private ArrayList<AnimalPart> animalParts;

	public Tray(int trayId, double maxWeight, String trayType, ArrayList<AnimalPart> animalParts) {
		super();
		this.trayId = trayId;
		this.maxWeight = maxWeight;
		this.trayType = trayType;
		this.animalParts = animalParts;
		currentWeight = 0;
	}

	public int getTrayId() {
		return trayId;
	}

	public void setTrayId(int trayId) {
		this.trayId = trayId;
	}

	public double getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}

	public String getTrayType() {
		return trayType;
	}

	public void setTrayType(String trayType) {
		this.trayType = trayType;
	}

	public ArrayList<AnimalPart> getAnimalParts() {
		return animalParts;
	}

	public void setAnimalParts(ArrayList<AnimalPart> animalParts) {
		this.animalParts = animalParts;
	}

	public double getCurrentWeight() {
		return currentWeight;
	}

	public void setCurrentWeight(double currentWeight) {
		this.currentWeight = currentWeight;
	}

	public void addAnimalPartToTray(AnimalPart animalPart) {
		double tempweight = currentWeight + animalPart.getWeight();

		if (animalPart != null && hasAnimalPart(animalPart)) {
			if (tempweight > maxWeight) {
				System.out.println("Animal part was not added to TRAY\nMax Weight exedeed");
			} else {
				animalParts.add(animalPart);
				currentWeight = tempweight;
			}
		}

	}

	public void removeAnimalPartFromTray(AnimalPart animalPart) {
		double tempweight = currentWeight - animalPart.getWeight();

		if (animalPart != null && hasAnimalPart(animalPart)) {
			if (tempweight <= 0) {
				System.out.println("Animal part was not removed\nMax Weight exedeed");
			} else {
				animalParts.remove(animalPart);
				currentWeight = tempweight;
			}
		}
	}

	public int sizeOfTray() {
		return animalParts.size();
	}

	public boolean isEmptyTray() {
		return animalParts.isEmpty();
	}

	public boolean hasAnimalPart(AnimalPart animalPart) {
		if (animalPart != null) {
			for (AnimalPart temp : animalParts)
				if (temp == animalPart)
					return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Tray [trayId=" + trayId + ", maxWeight=" + maxWeight + ", currentWeight=" + currentWeight
				+ ", trayType=" + trayType + ", animalParts=" + animalParts + "]";
	}

}
