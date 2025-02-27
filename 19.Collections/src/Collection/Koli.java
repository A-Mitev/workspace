package Collection;

public class Koli {

	private int doors;
	private String fuel;
	private int prise;
	private String marka;

	public Koli(int doors, String fuel, int price, String marka) {
		setDoors(doors);
		setFuel(fuel);
		setPrice(price);
		setMarka(marka);
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public void setPrice(int price) {
		this.prise = price;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getMarka() {
		return marka;
	}

	// @Override
	// public boolean equals(Object obj) {
	// if (!(obj instanceof Koli)) {
	// return false;
	// }
	// Koli newVehicle = (Koli) obj;
	// return newVehicle.doors == this.doors &&
	// newVehicle.fuel.equals(this.fuel)
	// && newVehicle.marka.equals(this.marka);
	// }

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Koli)) {
			return false;
		}

		Koli koliZaSravnqvane = (Koli) obj;
		return this.fuel.equals(koliZaSravnqvane.fuel) && this.doors == koliZaSravnqvane.doors;
	}
	
	@Override
	public int hashCode() {
	
		return this.doors * fuel.hashCode();
	}

	

	@Override
	public String toString() {
		return "Koli [doors=" + doors + ", fuel=" + fuel + ", prise=" + prise + ", marka=" + marka + "]";
	}

}
