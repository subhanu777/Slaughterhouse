package model;

import java.util.ArrayList;

public class Tray {

	private int trayId;
	private double maxWeight, currentWeight;
	private ArrayList<Integer> animalIds;

	public Tray(int trayId, double maxWeight) {
		this.trayId = trayId;
		this.maxWeight = maxWeight;
		animalIds = new ArrayList<Integer>();
		currentWeight = 0;
	}

	@Override
	public String toString() {
		return "Tray [trayId=" + trayId + ", maxWeight=" + maxWeight + ", currentWeight=" + currentWeight
				+ ", animalIds=" + animalIds + "]";
	}

}
