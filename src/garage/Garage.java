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

	public void removeVehicleByType(String name) {
		System.out.println("Removing " + name);

		for (Vehicle vehicle : vehicles) {
			if (vehicle.getClass().getSimpleName().equals(name))
				vehicles.remove(vehicle);

		}
	}

	public void removeAllVehicles() {
		System.out.println("Uh oh, there's nothing here!");
		vehicles.clear();

	}

	public int fixVehicles() {
		int price = 0;
		for (Vehicle v : this.vehicles) {
			price += v.Fix();
		}
		return price;
	}

	public void print() {
		// System.out.print("Mechanic: ");
		// System.out.print(this.getMechanic());
		System.out.println("Vehicles: [");
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

	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(ArrayList<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
}
