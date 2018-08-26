package testgroup;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertScript {
@Test
public void test() 
{
Reporter.log("Step 1",true);
SoftAssert s= new SoftAssert();
s.assertEquals("abc", "abc");
Reporter.log("Step 2",true);
s.assertEquals("abc", "xyz");
Reporter.log("Step 3",true);
s.assertAll();
Reporter.log("Step 4",true);
}
}
