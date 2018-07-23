package com.tlp;

public class FinancialStabilityLogic {
	
	private FinancialStability insurance;
	
	
	
	
	public FinancialStabilityLogic(FinancialStability insurance) {
		super();
		this.insurance = insurance;
	}




	public FinancialStability getInsurance() {
		return insurance;
	}




	public void setInsurance(FinancialStability insurance) {
		this.insurance = insurance;
	}




	public void start() {
		
		if(insurance.getYearsInBusiness()<=1) {
					insurance.setStatus("poor");
				}
		else
			if(insurance.getYearsInBusiness()>=1 && insurance.getYearsInBusiness()<=5) {
				
					if(insurance.getBankRuptcs()==0)
						insurance.setStatus("Average");
					
					if(insurance.getBankRuptcs()==1)
						
						if(insurance.getYearAtCurrentAddress()<1 && insurance.getYearAtCurrentAddress()>=1 && insurance.getYearAtCurrentAddress()<5)
							
							insurance.setStatus("poor");
					
					if(insurance.getBankRuptcs()>1)
						
						insurance.setStatus("poor");
			   }
			else
				if(insurance.getYearsInBusiness()>5)
				{
					if(insurance.getBankRuptcs()==0)
						
						insurance.setStatus("Excellent");
					
					if(insurance.getBankRuptcs()==1)
						
						if(insurance.getYearAtCurrentAddress()<1 && insurance.getYearAtCurrentAddress()>=1 && insurance.getYearAtCurrentAddress()<5) 
							insurance.setStatus("Average");
		
							
				if(insurance.getBankRuptcs()==1)
					
					if(insurance.getYearAtCurrentAddress()>=5)
						insurance.setStatus("Excellent");
				
			
				}
	

}
}
