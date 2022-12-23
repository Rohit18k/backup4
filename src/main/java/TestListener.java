//
//import java.io.IOException;
//
//import org.testng.IDynamicGraph.Status;
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//import com.fitsyn.qa.base.TestBase1;
//
//public class TestListener extends TestBase1 implements ITestListener{
//	Object test;
//	 Object report;
//	
//	
//    public void onFinish(ITestContext arg0) {
//        // TODO Auto-generated method stub
//        
//    }
//
//    public void onStart(ITestContext arg0) {
//        
//        
//    }
//
//    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
//        // TODO Auto-generated method stub
//        
//    }
//
//    public void onTestFailure(ITestResult arg0) {
//        try {
//            
//			Object test;
//			test.log(Status.FAIL, "Failed Case is: " + arg0.getName());
//            ((Object) test).addScreenCaptureFromPath(TestListener.takeScreenShot(arg0.getName()));
//            test.log(Status.FAIL, arg0.getName()+" FAIL with error " + arg0.getThrowable());
//            
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        
//   
//		((Object) report).flush();
//        
//    }
//
//    public void onTestSkipped(ITestResult arg0) {
//        // TODO Auto-generated method stub
//        
//    }
//
//    public void onTestStart(ITestResult arg0) {
//               
//         // TODO Auto-generated method stub
//    } 
//
//    public void onTestSuccess(ITestResult arg0) {
//        test.log(Status.PASS, "Pass: " + arg0.getName());
//        
//        
//    }
//    
//    
//
//}
