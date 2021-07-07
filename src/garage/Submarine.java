package garage;

public class Submarine extends Vehicle {

	private String colour;
	private boolean periscope;

	public Submarine() {

	}

	public Submarine(String name, int numberOfWheels, boolean fixed, String colour, boolean periscope) {
		super(name, numberOfWheels, fixed);
		this.colour = colour;
		this.periscope = periscope;
	}

//	public void print() {
//		System.out.println("Fill this in");
//	}

	@Override
	public int invoice() {
		int invoice = getNumberOfWheels() + 2 * 100;
		return invoice;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isPeriscope() {
		return periscope;
	}

	public void setPeriscope(boolean periscope) {
		this.periscope = periscope;
	}

}
