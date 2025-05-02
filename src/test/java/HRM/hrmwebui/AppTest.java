package HRM.hrmwebui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void testLogIn() {
        App myapp=new App();
        Assert.assertEquals(1, myapp.userLogin("iphonepnt@gmail.com", "Tester@7453"));
    }
    
    @Test
    public void testFailedLogIn() {
    	  App myapp=new App();
          Assert.assertEquals(1, myapp.userLogin("iphonepnt@gmail.com", "Tester@7453"));
    }
}
