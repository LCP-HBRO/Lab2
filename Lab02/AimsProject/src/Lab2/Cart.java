package hust.soict.dsai.aims.cart.Cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>();

	// Method to return the quantity of ordered items
	public int qtyOrdered() {
		return itemsOrdered.size();
	}

	public ArrayList<DigitalVideoDisc> getItemsOrdered() {
		return itemsOrdered;
	}

	public void setItemsOrdered(ArrayList<DigitalVideoDisc> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}

	// Method to add a DVD to the cart
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered() < MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(disc);
			System.out.println("The disc has been added successfully");
		} else {
			System.out.println("The cart is full. Cannot add more DVDs.");
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		if ((qtyOrdered() + dvdList.length) <= MAX_NUMBERS_ORDERED) {
			for (DigitalVideoDisc dvd : dvdList) {
				itemsOrdered.add(dvd);
			}
			System.out.println("All DVDs have been added successfully");
		} else {
			System.out.println("Can't add all the DVDs. The cart will be full.");
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if ((qtyOrdered() + 2) <= MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(dvd1);
			itemsOrdered.add(dvd2);
			System.out.println("The 2 discs have been added successfully");
		} else {
			System.out.println("The cart is full. Cannot add 2 more DVDs.");
		}
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (itemsOrdered.remove(disc)) {
			System.out.println("The disc has been removed successfully");
		} else {
			System.out.println("The disc isn't in the cart");
		}
	}

	public float totalCost() {
		float cost = 0;
		for (DigitalVideoDisc disc : itemsOrdered) {
			cost += disc.getCost();
		}
		return cost;
	}

	public void printCart() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		int index = 1;
		for (DigitalVideoDisc disc : itemsOrdered) {
			System.out.println(index + ". " + disc.toString());
			index++;
		}
		System.out.println("Total cost: " + totalCost() + " $");
		System.out.println("***************************************************");
	}
}
