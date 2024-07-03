package UseCase2.TestCase;

import org.testng.annotations.Test;
import UseCase2.POMReference.LandingPage;
import UseCase2.TestComponent.BaseTest;

public class PositiveTestCase extends BaseTest {

    @Test
    public void positiveTest() {
        landingPage.login("Admin", "admin123");
    }
}
