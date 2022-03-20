package SimpleFactoryDesign;

public class PlanFactory {

	public Plan getPlan(PlanType planType) {

		if (planType == null)
			return null;
		else if (planType == PlanType.Domestic)
			return new Domestic();
		else if (planType == PlanType.Commercial)
			return new Commercial();
		else if (planType == PlanType.Institutional)
			return new Institutional();
		return null;
	}
}
