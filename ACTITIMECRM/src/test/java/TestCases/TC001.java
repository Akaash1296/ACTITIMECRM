package TestCases;

import org.testng.annotations.Test;

import Libraries.BasedTest;
import POMPages.HomePage;

public class TC001 extends BasedTest {
	
	@Test
	public void testTC001() {
		HomePage h = new HomePage(driver, wTools);
		h.clickTimeTrack();
		h.clickTasks();
		h.clickReports();
		h.clickUsers();
	}

}
