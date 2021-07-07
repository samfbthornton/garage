package garage;

public class Train extends Vehicle {

	private String tubeLine;

	private int numberOfCars;

	public Train() {

	}

	public Train(String name, int numberOfWheels, boolean fixed, String tubeLine, int numberOfCars) {
		super(name, numberOfWheels, fixed);
		this.tubeLine = tubeLine;
		this.numberOfCars = numberOfCars;
	}

	@Override
	public void Print() {
		System.out.print("Vehicle: ");
		System.out.println(this.getName());
		System.out.print("Number of Wheels: ");
		System.out.println(this.getNumberOfWheels());
		System.out.print("Fixed?: ");
		System.out.println(this.isFixed());
		System.out.print("Tubeline: ");
		System.out.println(this.getTubeLine());
		System.out.print("Number of Cars: ");
		System.out.println(this.getNumberOfCars());
		System.out.print("Invoice cost: £");
		System.out.println(this.invoice());
	}

	@Override
	public int invoice() {
		int invoice = getNumberOfCars() * 100;
		return invoice;
	}

	public int getNumberOfCars() {
		return numberOfCars;
	}

	public void setNumberOfCars(int numberOfCars) {
		this.numberOfCars = numberOfCars;
	}

	public String getTubeLine() {
		return tubeLine;
	}

	public void setTubeLine(String tubeLine) {
		this.tubeLine = tubeLine;
	}

}
