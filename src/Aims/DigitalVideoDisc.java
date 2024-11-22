package Aims;

public class DigitalVideoDisc {
    // Instance variables
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // Class variable to track the number of DVDs created
    private static int nbDigitalVideoDiscs = 0;

    // Instance variable for the unique ID
    private int id;

    // Accessors (Getters)
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    // Constructor - All attributes
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;

        // Increment class variable and assign unique ID
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Constructor - By Title
    public DigitalVideoDisc(String title) {
        this.title = title;

        // Increment class variable and assign unique ID
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
    
    public void setTitle(String title) {
    	this.title = title;
    }

    // Constructor - By category, title, and cost
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;

        // Increment class variable and assign unique ID
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Constructor - By director, category, title, and cost
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;

        // Increment class variable and assign unique ID
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Display information about the DVD
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Category: " + category);
        System.out.println("Director: " + director);
        System.out.println("Length: " + length + " mins");
        System.out.println("Cost: $" + cost);
        System.out.println();
    }

	public boolean isMatch(String title2) {
		// TODO Auto-generated method stub
		return false;
	}
}
