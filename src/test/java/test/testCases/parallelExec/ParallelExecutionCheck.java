package test.testCases.parallelExec;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups = "classOneTests")
public class ParallelExecutionCheck extends ParallelExecutionBaseTest  {

	@BeforeTest
	public void before() {
		System.out.println("@BeforeTest-"+ Thread.currentThread().getId());
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod-"+ Thread.currentThread().getId());
	}

	@Test
	public void test1() {
		System.out.println("@Test1-"+ Thread.currentThread().getId());
	}

	@Test
	public void test2() {
		System.out.println("@Tets2-"+ Thread.currentThread().getId());
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod-"+ Thread.currentThread().getId());
	}

	@AfterTest
	public void after() {
		System.out.println("@AfterTest-"+ Thread.currentThread().getId());
	}

}
