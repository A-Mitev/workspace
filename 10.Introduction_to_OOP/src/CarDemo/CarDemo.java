package CarDemo;

public class CarDemo {
	public static void main(String[] args) {

		Car skoda = new Car();
		skoda.color = "silver";
		skoda.maxSpeed = 220;

		Person Dobri = new Person();
		Dobri.name = "Dobri";
		Dobri.age = 33;

		skoda.owner = Dobri;
		
		Person Pepa = new Person();
		Pepa.age = 40;
		Pepa.name = "Pepkaa";
		
		Dobri.friend = Pepa;
		
		
		System.out.println(Dobri.friend.name);

		System.out.println(skoda.owner.name + " " + skoda.owner.age + " " + skoda.maxSpeed);

	}
}
