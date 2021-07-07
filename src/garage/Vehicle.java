package garage;

public abstract class Vehicle {

	private String name;
	private int numberOfWheels;
	private boolean roof;

	public Vehicle(String name, int numberOfWheels, boolean roof) {
		this.name = name;
		this.numberOfWheels = numberOfWheels;
		this.roof = roof;
	}

	public Vehicle() {
	}

	public abstract int Fix();

	public void Print() {
		System.out.print("Vehicle: ");
		System.out.println(this.getName());
		System.out.print("Number of Wheels: ");
		System.out.println(this.getNumberOfWheels());
		System.out.print("Roof?: ");
		System.out.println(this.isRoof());
		System.out.print("Invoice cost: £");
		System.out.println(this.Fix());
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

	public boolean isRoof() {
		return roof;
	}

	public void setRoof(boolean roof) {
		this.roof = roof;
	}

}
