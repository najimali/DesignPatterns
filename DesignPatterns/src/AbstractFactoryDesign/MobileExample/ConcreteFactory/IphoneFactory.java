package AbstractFactoryDesign.MobileExample.ConcreteFactory;

import AbstractFactoryDesign.MobileExample.ConcreteProducts.Iphone11;
import AbstractFactoryDesign.MobileExample.ConcreteProducts.Iphone11Battery;
import AbstractFactoryDesign.MobileExample.Constants.MobileType;
import AbstractFactoryDesign.MobileExample.Factory.MobileFactory;
import AbstractFactoryDesign.MobileExample.Products.Battery;
import AbstractFactoryDesign.MobileExample.Products.Mobile;

public class IphoneFactory implements MobileFactory {

	@Override
	public Mobile getMobile(MobileType mobiletype) {
		// TODO Auto-generated method stub
		if (mobiletype == MobileType.Iphone11)
			return new Iphone11();
		return null;
	}

	@Override
	public Battery getBattery(MobileType mobiletype) {
		// TODO Auto-generated method stub
		if (mobiletype == MobileType.Iphone11)
			return new Iphone11Battery();
		return null;
	}

}