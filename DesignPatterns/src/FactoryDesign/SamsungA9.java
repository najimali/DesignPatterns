package FactoryDesign;

public class SamsungA9 implements Mobile {

	@Override
	public void createMobile() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + " is created");
	}

}