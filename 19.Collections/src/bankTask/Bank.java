package bankTask;

import java.util.Collections;
import java.util.List;

public class Bank {

	@Override
	public String toString() {
		return "Bank [name=" + name + ", address=" + address + ", bankProducts=" + bankProducts + ", availableMoney="
				+ availableMoney + ", bankReserve=" + bankReserve + "]";
	}

	private static final double MINIMUM_MONEY_AVAILABILITY = 0.1;
	private String name;
	private String address;

	private List<BankProduct> bankProducts;

	private double availableMoney;

	public double getAvailableMoney() {
		return availableMoney;
	}

	private double bankReserve;

	public Bank(String name, double availableMoney) throws FaliralaBankaException {
		this.setName(name);
		this.setAvailableMoney(availableMoney);
	}

	

	public void setName(String name) {
		if (name != null & !name.equals("")) {
			this.name = name;
		}
	}

	public void addDeposit(Deposit deposit) {
		this.bankProducts.add(deposit);
	}

	public void addCredit(Credit credit) {
		this.bankProducts.add(credit);
	}

	public void setBankReserve(double bankReserve) throws FaliralaBankaException {
		double allMoneyInDeposits = 0;
		if (bankReserve > 0) {
			for (int product = 0; product < bankProducts.size(); product++) {
				if (bankProducts.get(product) instanceof Deposit) {
					allMoneyInDeposits += (((Deposit) bankProducts.get(product))).getAvailability();
				}
			}
			if (bankReserve < allMoneyInDeposits * MINIMUM_MONEY_AVAILABILITY) {
				throw new FaliralaBankaException("Bankata e falirala!");
			} else {
				this.bankReserve = bankReserve;
			}
		}
	}

	public void payingInterest() {
		for (int product = 0; product < bankProducts.size(); product++) {
			if (bankProducts.get(product) instanceof Deposit) {
				Deposit temp = ((Deposit) (this.bankProducts.get(product)));
				temp.setAvailability(temp.getAvailability() + temp.getAvailability() * temp.getAnnualRate());
			}
		}
	}

	public double getBankReserve() {
		return bankReserve;
	}

	public void setBankProducts(List<BankProduct> bankProducts) {
		if (bankProducts != null) {
			this.bankProducts = bankProducts;
		}
	}
	
	public void setAvailableMoney(double availableMoney) {
		this.availableMoney = availableMoney;
	}

	public List<BankProduct> getBankProducts() {
		return Collections.unmodifiableList(bankProducts);
	}

}
