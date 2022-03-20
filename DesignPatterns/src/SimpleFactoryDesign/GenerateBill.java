package SimpleFactoryDesign;

public class GenerateBill {

	void print(Plan plan, int units) {
		System.out.println(plan.getClass().getSimpleName() + " plan rate is " + plan.getRate()
				+ " per unit and bill is = " + plan.calculateBill(units) + " rs");
	}
}
