package test.testCases.parallelExec;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups = "classOneTests")
public class ParallelExecutionCheckNew extends ParallelExecutionBaseTest {

	@BeforeTest
	public void before()  {
		System.out.println("@BeforeTest-ParallelExecutionCheckNew-"+ Thread.currentThread().getId());
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod-ParallelExecutionCheckNew-"+ Thread.currentThread().getId());
	}

	@Test
	public void test3() {
		System.out.println("@Test3-"+ Thread.currentThread().getId());
	}

	@Test
	public void test4() {
		System.out.println("@Tets4-"+ Thread.currentThread().getId());
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod-ParallelExecutionCheckNew-"+ Thread.currentThread().getId());
	}

	@AfterTest
	public void after() {
		System.out.println("@AfterTest-ParallelExecutionCheckNew-"+ Thread.currentThread().getId());
	}

}
