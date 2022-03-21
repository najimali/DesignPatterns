package AbstractFactoryDesign.MobileExample.ConcreteProducts;

import AbstractFactoryDesign.MobileExample.Products.Mobile;

public class SamsungA11 implements Mobile {

	@Override
	public void createMobile() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + " is created..");

	}

}