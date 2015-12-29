package com.yash.logger;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.PropertyConfigurator;

public class ServiceLogging {
static final Logger LOGGER=Logger.getLogger(ServiceLogging.class.getName());
public void getServiceLogging() throws IOException{
	PropertyConfigurator.configure("log4j.properties");
	Layout layout=new PatternLayout();
	Appender appender=new FileAppender(layout,"logs.log");
	LOGGER.addAppender(appender);
	LOGGER.warn("trace it");
	LOGGER.info("method begins");
}
}
