package org.training.ejb30.client;

import javax.naming.*;
import org.training.ejb30.server.*;

public class ClientJNDI {
	public static void main(String args[]) throws Exception {
		InitialContext ctx = new InitialContext();
		TimeService timeService = (TimeService) ctx.lookup("org.training.ejb30.server.TimeService");
		String time = timeService.getTime();
		System.out.println("Time is: " + time);
	}
}
