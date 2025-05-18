
public class Pet {

	//attributes
	private String petType;
	private String petName;
	private int petAge;
	private static int dogSpaces = 30;
	private static int catSpaces = 12;
	private int daysStay;
	private double amountDue;
	
	//construct
	public Pet(String petType, String petName, int petAge, int daysStay, double amountDue) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.daysStay = daysStay;
        this.amountDue = amountDue;
	}
	
	
	
	//getters
    public String getPetType() { return petType; }
    public String getPetName() { return petName; }
    public int getPetAge() { return petAge; }
    public static int getDogSpaces() { return dogSpaces; }
    public static int getCatSpaces() { return catSpaces; }
    public int getDaysStay() { return daysStay; }
    public double getAmountDue() { return amountDue; }
    
    //setters
    public void setPetType(String petType) { this.petType = petType; }
    public void setPetName(String petName) { this.petName = petName; }
    public void setPetAge(int petAge) { this.petAge = petAge; }
    public void setDaysStay(int daysStay) { this.daysStay = daysStay; }
    public void setAmountDue(double amountDue) { this.amountDue = amountDue; }
    
    //mutator for setCatSpaces and setDogSpaces
    public static void setDogSpaces(int spaces) {
        dogSpaces = spaces;
    }

    public static void setCatSpaces(int spaces) {
        catSpaces = spaces;
    }

    //method for updating spaces availability
    public static void decrementDogSpace() { if (dogSpaces > 0) dogSpaces--; }
    public static void decrementCatSpace() { if (catSpaces > 0) catSpaces--; }
    public static void incrementDogSpace() { dogSpaces++; }
    public static void incrementCatSpace() { catSpaces++; }
    
}
