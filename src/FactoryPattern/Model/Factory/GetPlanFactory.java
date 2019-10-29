package FactoryPattern.Model.Factory;

import FactoryPattern.Model.CommercialPlan;
import FactoryPattern.Model.DomesticPlan;
import FactoryPattern.Model.InstitutionalPlan;
import FactoryPattern.Model.Abstract.Plan;

public class GetPlanFactory {

	// use getPlan method to get object of type Plan
	public Plan getPlan(String planType) {
		if (planType == null) {
			return null;
		}
		if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan();
		} else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
			return new CommercialPlan();
		} else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
			return new InstitutionalPlan();
		}
		return null;
	}
}// end of GetPlanFactory class.
