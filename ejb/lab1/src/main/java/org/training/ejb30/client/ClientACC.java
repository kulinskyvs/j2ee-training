package org.training.ejb30.client;

import javax.ejb.EJB;
import org.training.ejb30.server.*;

public class ClientACC {

    @EJB
    //injected field must be static
    private static TimeService timeService;
	
    public static void main(String args[]) throws Exception {
	String time = timeService.getTime();
	System.out.println("Time is: " + time); 
   }
}
