package FactoryDesign;

public interface Plan {

	double getRate();

	default double calculateBill(int units) {

		return units * getRate();
	}
}
