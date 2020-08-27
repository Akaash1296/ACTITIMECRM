package TestCases;

import org.testng.annotations.Test;

import Libraries.BasedTest;
import POMPages.HomePage;

public class TC002 extends BasedTest {

	@Test
	public void testTC002() {
		HomePage h = new HomePage(driver, wTools);
		h.clickEnterTimeTrack();
		h.clickLockTimeTrack();
		h.clickViewTimeTrack();
		h.clickApproveTimeTrack();
	}
}
