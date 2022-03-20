package FactoryDesign;

public class SamsungA12 implements Mobile {

	@Override
	public void createMobile() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + " is created");
	}

}