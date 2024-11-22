package hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class DigitalVideoDisc {
	// Class attribute to track the number of DVDs created
	private static int nbDigitalVideoDiscs = 0;

	// Instance attributes for a DVD
	private int id;
	private String title;
	private String category;
	private float cost;
	private String director;
	private int length;

	// Constructor to initialize a new DVD instance
	public DigitalVideoDisc(String title, String category, float cost, String director, int length) {
		// Increment the number of DVDs created
		nbDigitalVideoDiscs++;

		// Assign the current value of nbDigitalVideoDiscs as the id
		this.id = nbDigitalVideoDiscs;

		// Set the other instance attributes
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director = director;
		this.length = length;
	}

	// Getters for the instance attributes
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director = director;
	}

	public float getCost() {
		return cost;
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}

	public DigitalVideoDisc(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, float cost, String director) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director = director;
	}

	// Method to display the DVD details
	@Override
	public String toString() {
		return "DigitalVideoDisc [ID=" + id + ", Title=" + title + ", Category=" + category + ", Director=" + director
				+ ", Length=" + length + " mins, Cost=" + cost + " $]";
	}

	// Static method to get the number of DVDs created
	public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}

}
