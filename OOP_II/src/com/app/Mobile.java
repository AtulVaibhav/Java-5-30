package com.app;

public class Mobile {
   Sim sim;
   Mobile(Sim sim){
	   this.sim = sim;
   }
   public String getSim(){
	   return this.sim.getSimInfo();
   }
}
