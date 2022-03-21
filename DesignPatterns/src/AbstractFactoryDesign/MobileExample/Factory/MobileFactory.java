package AbstractFactoryDesign.MobileExample.Factory;

import AbstractFactoryDesign.MobileExample.Constants.MobileType;
import AbstractFactoryDesign.MobileExample.Products.Battery;
import AbstractFactoryDesign.MobileExample.Products.Mobile;

public interface MobileFactory {
	Mobile getMobile(MobileType mobiletype);

	Battery getBattery(MobileType mobiletype);

}
