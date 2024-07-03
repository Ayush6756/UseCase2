package UseCase2.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import UseCase2.POMReference.LandingPage;
import UseCase2.TestComponent.BaseTest;

public class NegativeTestCase extends BaseTest {

    @Test
    public void negativeTest() {
        landingPage.login("Admin", "admin987");
        Assert.assertEquals("Incorrect email or password.", landingPage.getErrorMessage());
   
    }
}
