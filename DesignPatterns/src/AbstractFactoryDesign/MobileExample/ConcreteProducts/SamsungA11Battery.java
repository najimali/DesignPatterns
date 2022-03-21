package AbstractFactoryDesign.MobileExample.ConcreteProducts;

import AbstractFactoryDesign.MobileExample.Products.Battery;

public class SamsungA11Battery implements Battery {

	@Override
	public void showStrength() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + " strength is good");
	}

}