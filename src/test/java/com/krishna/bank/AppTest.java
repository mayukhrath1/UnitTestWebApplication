/**
 * 
 */
package com.krishna.bank;

import junit.framework.TestCase;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author Arunangsu
 *
 */
public class AppTest extends TestCase {

	/**
	 * 
	 */
	public AppTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public AppTest(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	 /**
     * @return the suite of tests being tested
  */
  public static Test suite() {
     return new TestSuite( AppTest.class );
  }

  /**
     * Rigourous Test :-)
  */
  public void testApp() {
     assertTrue( true );
  }

}
