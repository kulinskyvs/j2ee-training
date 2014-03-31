package org.training.ejb30.server;

import javax.ejb.Remote;

@Remote
public interface TimeService {
	public String getTime();
}

