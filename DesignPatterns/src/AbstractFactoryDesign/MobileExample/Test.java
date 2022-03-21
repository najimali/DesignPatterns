package AbstractFactoryDesign.MobileExample;

import AbstractFactoryDesign.MobileExample.ConcreteFactory.IphoneFactory;
import AbstractFactoryDesign.MobileExample.ConcreteFactory.SamsungFactory;
import AbstractFactoryDesign.MobileExample.Constants.MobileType;
import AbstractFactoryDesign.MobileExample.Factory.MobileFactory;
import AbstractFactoryDesign.MobileExample.Products.Battery;
import AbstractFactoryDesign.MobileExample.Products.Mobile;

//Abstract Factory design is one higher level than Factory Design Pattern.
//It deals with families of product or related product where as factory design deals with 
// single product.
// Each factory will create all the related product simultaneously
// In the Given Example below We have Two related product - Mobile & Battery
// We created abstract factory interface called MobileFactory which has two product 
// getMobile & showStrength
// So when user asks for SamsungA11 then we get both Mobile & Battery SamsungA11 
// similarly for Iphone11.
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileFactory mobileFactory = new SamsungFactory();
		run(mobileFactory, MobileType.SamsungA11);
		mobileFactory = new IphoneFactory();
		run(mobileFactory, MobileType.Iphone11);

	}

	static void run(MobileFactory mobileFactory, MobileType mobileType) {

		Mobile mobile = mobileFactory.getMobile(mobileType);
		Battery battery = mobileFactory.getBattery(mobileType);
		mobile.createMobile();
		battery.showStrength();

	}

}
