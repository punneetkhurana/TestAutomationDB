package helpers;
import org.apache.log4j.Logger;

/**
* The Log class implements a functionality that logs the test
* steps in a file 
* comments.
* @author  Puneet Khurana
* @version 1.0
* @since   2016-10-01 
*/
public class Log {

	private static Logger Log = Logger.getLogger(Log.class.getName()); 
	
	public static void startTestCase(String sTestCaseName){
		Log.info("Started Test case");
	}

	public static void endTestCase(String sTestCaseName){
		Log.info("Ended Test Case");
	}

	public static void info(String message)
	{
		Log.info(message);
	}

}