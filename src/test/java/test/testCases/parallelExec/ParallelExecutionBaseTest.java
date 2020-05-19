package test.testCases.parallelExec;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Test(groups = "classOneTests")
public class ParallelExecutionBaseTest  {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite-"+ Thread.currentThread().getId());
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite-"+ Thread.currentThread().getId());
	}

}
