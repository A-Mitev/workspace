package Constructors_HomeW_Task_1;
public class Computer_Summary {
	public static void main(String[] args) {

//		!  zakumentiranoto po-dolu e ot predishnata zadacha !
//		Computer asus = new Computer();
//		Computer dell = new Computer();


//		Asus.year = 2015;
//		Asus.price = 1500;
//		Asus.hardDiskMemory = 1000;
//		Asus.freeMemory = 950;
//		Asus.operationSystem = "Windows 8.1";
//		Asus.isNotebook = true;
//		//Asus.brand = "Asus";                     za test
//
//		Dell.year = 2010;
//		Dell.price = 599;
//		Dell.hardDiskMemory = 500;
//		Dell.freeMemory = 250;
//		Dell.operationSystem = "Linux";
//		Dell.isNotebook = false;
//		//Dell.brand = "Dell";                       za test
//		
//
//		String newOperationSystem = "Windows 10";
//		Asus.changeOperationSystem(newOperationSystem);
//
//		int memory = 150;
//		Dell.useMemory(memory);
//		
//		
//		System.out.println("Computer Asus characteristics:");
//		//Asus.printComputerElements("Asus");         za test
//		Asus.printComputerElements();
//		System.out.println();
//		System.out.println("Computer Dell characteristics:");
//		//Dell.printComputerElements("Dell");          za test
//		Dell.printComputerElements();
		
		Computer asus = new Computer(2015, 2500, 1000, 950, "Asus");
		Computer dell = new Computer(2014, 2500, 500, 350, "Dell", "Win7");
		
		asus.comparePrice(dell);
		
		
//		izhod predi da si napravq metod za printirane
//		if (asus.comparePrice(dell) == -1){
//			System.out.println("Asus e po-skyp");
//		} else if (asus.comparePrice(dell)== 1){
//			System.out.println("Dell e po-skup");
//		} else {
//			System.out.println("Cenata na dvata komputara e ednakva.");
//		}
		
		
		asus.printPrice(dell);
	}
}