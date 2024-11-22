package hust.soict.dsai.test.store.StoreTest;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store.Store;

public class StoreTest {
	public static void main(String[] args) {
		Store store = new Store();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", 19.99f, "Roger Allers", 90);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Aladdin", "Animation", 17.99f, "Ron Clements", 80);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Mulan", "Animation", 21.99f, "Tony Bancroft", 88);

		store.addDVD(dvd1);
		store.addDVD(dvd2);
		store.addDVD(dvd3);

		store.printStore();

		store.removeDVD(dvd2);

		DigitalVideoDisc dvdNotInStore = new DigitalVideoDisc("Hercules", "Animation", 15.99f, "John Musker", 93);
		store.removeDVD(dvdNotInStore);

		store.printStore();
	}
}
