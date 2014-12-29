  import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
     
    public class TakeScreenshot extends DateTime {
            public static void takeScreenshot() throws Exception {
                    File scrFile = ((TakesScreenshot) driver)
                                    .getScreenshotAs(OutputType.FILE);
                    System.out.println("StepBinarFailedAt" + getDateTime().toString());
                    FileUtils.copyFile(scrFile, new File(
                                    "/home/leonid/Pictures/ScreenshotsFromTests/BinarFailedAt"
                                                    + getDateTime().toString() + ".png"));
            }
    }