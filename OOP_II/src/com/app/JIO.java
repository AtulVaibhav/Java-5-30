package com.app;

public class JIO implements Sim{
	 int simNumber;
	   String simName;
	   
	   JIO(int simNumber,String simName){
		   this.simNumber=simNumber;
		   this.simName = simName;
	   }
	   
	   public String getSimInfo(){
		   return "Simnumber :"
	         +this.simNumber+" SimName"
		     +this.simName;
	   }
}
