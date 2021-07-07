package garage;

import java.util.ArrayList;

public class Garage {

	private String mechanic;

	public Garage() {
	}

	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);

	}

	public void removeVehicle(Vehicle vehicle) {
		this.vehicles.remove(vehicle);

	}

	public Vehicle findByName(String name) {
		for (Vehicle vehicle : this.vehicles) {
			if (vehicle.getName() == name) {

				return vehicle;
			}
		}
		return null;
	}

	public void print() {
		// System.out.print("Mechanic: ");
		// System.out.print(this.getMechanic());
		System.out.println("Vehicle: [");
		for (Vehicle v : this.vehicles) {
			v.Print();
		}
		System.out.println("]");
	}

	public String getMechanic() {
		return mechanic;
	}

	public void setMechanic(String mechanic) {
		this.mechanic = mechanic;
	}
}
