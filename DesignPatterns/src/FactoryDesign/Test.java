package FactoryDesign;

//Source
//https://www.youtube.com/watch?v=tdMOdeewTnc&list=PL_xlJum5pRdD_TEiWf9jK4Ozzg8VJyDSe&index=3

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileFactory mobileFactory = new SamsungFactory();
		display(mobileFactory, MobileType.SamsungA12);
		display(mobileFactory, MobileType.SamsungA9);
		mobileFactory = new IphoneFactory();
		display(mobileFactory, MobileType.Iphone12);
		display(mobileFactory, MobileType.Iphone13);

	}

	static void display(MobileFactory mobileFactory, MobileType type) {
		Mobile mobile = mobileFactory.getMobile(type);
		mobile.createMobile();
	}

}
