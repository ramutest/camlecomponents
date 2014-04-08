package com.sst;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExampleBean {
	private final static Logger LOGGER = Logger.getLogger(ExampleBean.class .getName()); 
	
	public String sayHello(String name) {
		LOGGER.log(Level.INFO,  "***************sayHello******************* " );
		return "Hello " + name + "!";
	}

}
