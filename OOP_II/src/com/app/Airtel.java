package com.app;

public class Airtel implements Sim {
	 int simNumber;
	   String simName;
	   
	   Airtel(int simNumber,String simName){
		   this.simNumber=simNumber;
		   this.simName = simName;
	   }
	   
	   public String getSimInfo(){
		   return "SimNumber :"
	         +this.simNumber+" SimName :"
		     +this.simName;
	   }
}
