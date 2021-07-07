package garage;

public class Submarine extends Vehicle {

	private String colour;
	private boolean periscope;

	public Submarine() {

	}

	public Submarine(String name, int numberOfWheels, boolean roof, String colour, boolean periscope) {
		super(name, numberOfWheels, roof);
		this.colour = colour;
		this.periscope = periscope;
	}

	@Override
	public void Print() {
		System.out.print("Vehicle: ");
		System.out.println(this.getName());
		System.out.print("Number of Wheels: ");
		System.out.println(this.getNumberOfWheels());
		System.out.print("Roof?: ");
		System.out.println(this.isRoof());
		System.out.print("Number of Blades: ");
		System.out.println(this.getColour());
		System.out.print("Can it Fly? ");
		System.out.println(this.isPeriscope());
		System.out.print("Invoice cost: £");
		System.out.println(this.Fix());
		System.out.println("----------------------");
	}

	@Override
	public int Fix() {
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
