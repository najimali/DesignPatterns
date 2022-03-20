package FactoryDesign;

public class SamsungFactory implements MobileFactory {

	@Override
	public Mobile getMobile(MobileType type) {
		// TODO Auto-generated method stub

		if (type == MobileType.SamsungA9)
			return new SamsungA9();
		if (type == MobileType.SamsungA12)
			return new SamsungA12();

		return null;
	}

}