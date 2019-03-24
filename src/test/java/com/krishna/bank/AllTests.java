package com.krishna.bank;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

@RunWith(Suite.class)
@SuiteClasses({ AppTest.class, AppTest1.class })
public class AllTests {
	public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(AppTest.class,AppTest1.class);
			
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());

}
}
