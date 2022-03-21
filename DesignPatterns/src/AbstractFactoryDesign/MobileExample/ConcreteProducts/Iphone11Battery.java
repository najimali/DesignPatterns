package AbstractFactoryDesign.MobileExample.ConcreteProducts;

import AbstractFactoryDesign.MobileExample.Products.Battery;

public class Iphone11Battery implements Battery {

	@Override
	public void showStrength() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + " strength is weak");
	}

}