package com.app;

public class Idea implements Sim{
   int simNumber;
   String simName;
   
   Idea(int simNumber,String simName){
	   this.simNumber=simNumber;
	   this.simName = simName;
   }
   
   public String getSimInfo(){
	   return "Simnumber :"
         +this.simNumber+" SimName"
	     +this.simName;
   }
   
}
