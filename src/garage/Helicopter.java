package garage;

public class Helicopter extends Vehicle {

	private int numberOfBlades;
	private boolean canFly;

	public Helicopter() {

	}

	public Helicopter(String name, int numberOfWheels, boolean fixed, int numberOfBlades, boolean canFly) {
		super(name, numberOfWheels, fixed);
		this.numberOfBlades = numberOfBlades;
		this.canFly = canFly;
	}

	@Override
	public void Print() {
		System.out.print("Vehicle: ");
		System.out.println(this.getName());
		System.out.print("Number of Wheels: ");
		System.out.println(this.getNumberOfWheels());
		System.out.print("Fixed?: ");
		System.out.println(this.isFixed());
		System.out.print("Number of Blades: ");
		System.out.println(this.getNumberOfBlades());
		System.out.print("Can it Fly? ");
		System.out.println(this.isCanFly());
		System.out.print("Invoice cost: £");
		System.out.println(this.invoice());
	}

	@Override
	public int invoice() {
		int invoice = getNumberOfBlades() * 100;
		return invoice;
	}

	public int getNumberOfBlades() {
		return numberOfBlades;
	}

	public void setNumberOfBlades(int numberOfBlades) {
		this.numberOfBlades = numberOfBlades;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

}
