package com.mulesoft.training;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;
import org.mule.tck.junit4.rule.DynamicPort;

public class HelloMavenTest extends FunctionalTestCase {

	@Rule
	public DynamicPort myPort=new DynamicPort("http.port");
    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
    	System.out.println("\n\n Test case 1: HTTP PORT--->"+myPort.getNumber()+ "\n\n");
        runFlowAndExpect("mavenFlow", "Hello world");
    }
    
    @Override
    protected String getConfigFile() {
        return "maven-project.xml";
    }

}
