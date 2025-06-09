package genericPackage;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class MyListener extends baseTest implements ITestListener {

	private static final String TaksScreenhot = null;

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("[Test Case --"+result.getName()+" Started ]", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("[Test Case --"+result.getName()+" Successfully Executed]", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("[Test Case --"+result.getName()+" has faoled]", true);
		LocalDateTime dateTime = LocalDateTime.now();
		String DT= LocalDateTime.now().toString();
		String dateTime1=DT.replaceAll(":","-");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		  Object scr = ts.getScreenshotAs(OutputType.FILE);
		  File dest = new File("./screenshots/"+result.getName()+""+dateTime1+".png");
		  
		try {
			Files.copy((File) scr,dest);
		}
		catch(IOException e) {
			e.printStackTrace();
		
		}
				
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("[Test Case --"+result.getName()+" is Skipped]", true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("[Test Case --"+result.getName()+" has failed with certain percentage]", true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("[Test Case --"+result.getName()+" has failed with certain timeout]", true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("<test>--"+context.getName()+"has started execution", true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("<test>--"+context.getName()+"has Executed at last", true);
	}

/*Override
	public void onStart(ITestContext context) {
	    Reporter.log("<test>--" + context.getName() + " has started execution", true);
	}
	📌 Context:
	This code is part of a TestNG Listener implementation. Specifically, it overrides the onStart() method from the ITestListener interface.

	🔍 Explanation:
	@Override
	This annotation indicates that this method is overriding a method from an interface or superclass — in this case, the onStart() method from the ITestListener.

	public void onStart(ITestContext context)
	This method is automatically called before any test methods (like @Test) in a test class start executing.
	ITestContext provides metadata about the test context — like the test name, test methods, parameters, etc.

	context.getName()
	This gets the name of the current test (usually the test tag name defined in testng.xml or the class name if not defined explicitly).

	Reporter.log(...)
	This logs a message into the TestNG report.
	The second parameter true indicates that the message should also be printed to the console (standard output).

	Message being logged:
	"<test>--" + context.getName() + " has started execution"
	→ This creates a log message like:
	"<test>--LoginTest has started execution"

	✅ Summary:
	This code logs a message to indicate that a test has started, using the name of the test class or method.
	 It's helpful for debugging and tracking test execution flow in reports and the console.*/
	

}
