package com.tlp;

public class OverallPricingLogic {

	
	private OverallPricing Insurance;

	public OverallPricingLogic(OverallPricing insurance) {
	
	this.Insurance = insurance;
	}
	
	
	 public OverallPricing getInsurance() {
		return Insurance;
	}


	public void setInsurance(OverallPricing insurance) {
		Insurance = insurance;
	}


	public void start()
	{
		
		if(Insurance.getCustomerFinancialStability()=="excellent")
		{
		    if(Insurance.getCoverageLiability()=="high")	
		    {	
		     if(Insurance.getStatus()=="high")
		    	  
		    Insurance.setStatus("");
		    
		     else
		    	 
		    if(Insurance.getPropertyrisk()=="med"  && Insurance.getStatus()=="low")
		    			    	
		    	Insurance.setStatus("refer");
		    }
		    
		  
		    else	if(Insurance.getCoverageLiability()=="med")
		
		    {
		    	if(Insurance.getPropertyrisk()=="")
		    		
		    		Insurance.setStatus("B");
		    	
		    }
		    else
		    	if(Insurance.getCoverageLiability()=="low")
		    	{
		    		if(Insurance.getPropertyrisk()=="")
		    			
		    			Insurance.setStatus("A");
		    	
		    	}
		}
		else  
		{
		if(Insurance.getCustomerFinancialStability()=="average")
			
		{
			if(Insurance.getCoverageLiability()=="high")
			{
				if(Insurance.getPropertyrisk()=="")
					
				Insurance.setStatus("refer");
			}
			else
				if(Insurance.getCoverageLiability()=="med")
				{
					if(Insurance.getPropertyrisk()=="high")
						
						Insurance.setStatus("C");
				}
				else
					if(Insurance.getPropertyrisk()=="med"  && Insurance.getPropertyrisk()=="low")
						
						Insurance.setStatus("B");
			if(Insurance.getCoverageLiability()=="low")
			{
				if(Insurance.getPropertyrisk()=="")
					Insurance.setStatus("A");
				}
		}
		
		
		}
		
		
	
		
			if(Insurance.getCustomerFinancialStability()=="poor")
		

				Insurance.setStatus("reject");
				
						
			
			
		
		
	}
}
