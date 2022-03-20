package SimpleFactoryDesign;
// Source:

//- https://www.javatpoint.com/factory-method-design-pattern
//- https://refactoring.guru/design-patterns/factory-method

// Factory Design states that just define the interface or abstract class

//&& let the subclass decide which class to instantiate

// Usage of Factory Design Pattern
//1. When a class doesn't know what sub-classes specify will be required to create.
//2. When a class wants that its sub-classes specify the objects to be created.
//3. When the parent classes choose the creation of objects to its sub-classes.

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlanFactory planFactory = new PlanFactory();
		GenerateBill printBill = new GenerateBill();
		Plan plan = planFactory.getPlan(PlanType.Domestic);
		printBill.print(plan, 4);
		plan = planFactory.getPlan(PlanType.Commercial);
		printBill.print(plan, 5);
		plan = planFactory.getPlan(PlanType.Institutional);
		printBill.print(plan, 6);

	}

}
