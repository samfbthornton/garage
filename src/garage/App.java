package garage;

public class App {

	public static void main(String[] args) {

		Garage garage = new Garage();
		garage.addVehicle(new Train("Train", 12, false, "Jubilee", 7));
		garage.addVehicle(new Submarine("Submarine", 0, true, "Yellow", true));
		garage.addVehicle(new Helicopter("Helicopter", 0, true, 3, true));
		garage.addVehicle(new Helicopter("Helicopter", 4, false, 5, true));

		garage.print();

		garage.removeVehicleByType("Helicopter");

		garage.print();
//
//		Vehicle found = garage.findByName("Rocket");
//
//		if (found != null) {
//			System.out.println(found);
//		} else {
//			System.out.println("Vehicle Stolen!");
//		}
//
//		System.out.println("Total invoices= ?" + garage.calculateInvoice());
//
//		garage.removeVehicleByName("Train");

	}

}
