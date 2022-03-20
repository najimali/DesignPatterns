package FactoryDesign;

public class Iphone12 implements Mobile {

	@Override
	public void createMobile() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + " is created");
	}

}
