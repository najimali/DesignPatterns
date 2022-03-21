package AbstractFactoryDesign.MobileExample.ConcreteFactory;

import AbstractFactoryDesign.MobileExample.ConcreteProducts.SamsungA11;
import AbstractFactoryDesign.MobileExample.ConcreteProducts.SamsungA11Battery;
import AbstractFactoryDesign.MobileExample.Constants.MobileType;
import AbstractFactoryDesign.MobileExample.Factory.MobileFactory;
import AbstractFactoryDesign.MobileExample.Products.Battery;
import AbstractFactoryDesign.MobileExample.Products.Mobile;

public class SamsungFactory implements MobileFactory {

	@Override
	public Mobile getMobile(MobileType mobiletype) {
		// TODO Auto-generated method stub
		if (mobiletype == MobileType.SamsungA11)
			return new SamsungA11();
		return null;
	}

	@Override
	public Battery getBattery(MobileType mobiletype) {
		// TODO Auto-generated method stub
		if (mobiletype == MobileType.SamsungA11)
			return new SamsungA11Battery();
		return null;
	}

}