package FactoryDesign;

public class IphoneFactory implements MobileFactory {

	@Override
	public Mobile getMobile(MobileType type) {
		// TODO Auto-generated method stub

		if (type == MobileType.Iphone12)
			return new Iphone12();
		if (type == MobileType.Iphone13)
			return new Iphone13();
		return null;
	}

}