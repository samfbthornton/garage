package garage;

public abstract class Vehicle {

	private String name;
	private int numberOfWheels;
	private boolean fixed;

	public Vehicle(String name, int numberOfWheels, boolean fixed) {
		this.name = name;
		this.numberOfWheels = numberOfWheels;
		this.fixed = fixed;
	}

	public Vehicle() {
	}

	public abstract int invoice();

	public void Print() {
		System.out.print("Vehicle: ");
		System.out.println(this.getName());
		System.out.print("Number of Wheels: ");
		System.out.println(this.getNumberOfWheels());
		System.out.print("Fixed?: ");
		System.out.println(this.isFixed());
		System.out.print("Invoice cost: £");
		System.out.println(this.invoice());
		System.out.println("----------------");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public boolean isFixed() {
		return fixed;
	}

	public void setFixed(boolean fixed) {
		this.fixed = fixed;
	}

}
