package com.tlp;

public class CoveragestabilityLogic {

	private CoverageStability insurance;
	private final static String[] industryArr = {"Medical", "Construction", "Retail"};
	private final static String[] coverageArr = {"Malpractice", "Building", "Contents"};

	public CoveragestabilityLogic(CoverageStability insurance) {
		this.insurance = insurance;
	}
	
	

	
	public static String[] getCoveragearr() {
		return coverageArr;
	}




	public static String[] getIndustryarr() {
		return industryArr;
	}




	public CoverageStability getInsurance() {
		return insurance;
	}




	public void setInsurance(CoverageStability insurance) {
		this.insurance = insurance;
	}




	public void start() {
		

		if(insurance.getCoverage()=="malpractise")
		{
			if(insurance.getIndustry()=="medical")
			{
				insurance.setStatus("high");
			
			//System.out.println("hello");
			}
			else
				if(insurance.getCoverage()=="construction")
				{
					insurance.setStatus("med");
				//System.out.println("hi");
				
				}	else
					if(insurance.getIndustry()=="retail")
						insurance.setStatus("low");
		}
		else
			if(insurance.getCoverage()=="building")
			{
				if(insurance.getIndustry()=="medical")
				{
					insurance.setStatus("med");
				//System.out.println("hi");
				}
				else
					if(insurance.getCoverage()=="construction")
						
						insurance.setStatus("med");
					else
						if(insurance.getIndustry()=="retail")
							insurance.setStatus("med");
				
			
			}
			else
				if(insurance.getCoverage()=="contents")
				{
					if(insurance.getIndustry()=="medical")
					
						insurance.setStatus("high");
					
					else
						if(insurance.getCoverage()=="construction")
							
							insurance.setStatus("low");
						else
							if(insurance.getIndustry()=="retail")
								insurance.setStatus("high");
				
		

		
		
	}

	}	
	
	
	
	

}