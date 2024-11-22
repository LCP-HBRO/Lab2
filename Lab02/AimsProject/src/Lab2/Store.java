package hust.soict.dsai.aims.store.Store;

import java.util.ArrayList;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Store {
	private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();

	// Method to add a DVD to the store
	public void addDVD(DigitalVideoDisc dvd) {
		if (dvd != null) {
			itemsInStore.add(dvd);
			System.out.println("The DVD \"" + dvd.getTitle() + "\" has been added to the store.");
		} else {
			System.out.println("Cannot add a null DVD to the store.");
		}
	}

	// Method to remove a DVD from the store
	public void removeDVD(DigitalVideoDisc dvd) {
		if (itemsInStore.remove(dvd)) {
			System.out.println("The DVD \"" + dvd.getTitle() + "\" has been removed from the store.");
		} else {
			System.out.println("The DVD \"" + (dvd != null ? dvd.getTitle() : "Unknown") + "\" is not in the store.");
		}
	}

	// Method to print all DVDs in the store
	public void printStore() {
		System.out.println("***************STORE INVENTORY***************");
		if (itemsInStore.isEmpty()) {
			System.out.println("The store is currently empty.");
		} else {
			for (DigitalVideoDisc dvd : itemsInStore) {
				System.out.println(dvd.toString());
			}
		}
		System.out.println("**********************************************");
	}
}
