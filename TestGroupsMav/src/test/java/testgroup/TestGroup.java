package testgroup;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestGroup {
@Test(priority=1,groups="smoke")
public void test()
{
	Reporter.log("Test1",true);

}
@Test(priority=2,groups="smoke")
public void test2()
{
	Reporter.log("Test2",true);

}

@Test(priority=3,groups="regression")
public void test3()
{
	Reporter.log("Test3",true);

}

@Test(priority=4,groups="regression")
public void test4()
{
	Reporter.log("Test4",true);

}

}
