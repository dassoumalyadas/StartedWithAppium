import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumTest extends BaseTest {

    @Test
    public void appiumTest1() throws MalformedURLException {
        //Appium code --> Appium server --> Mobile
        //command to start appium server manually: appium
        //Below code is to start appium server Autoamtically using main.js from below location.
       /* AppiumDriverLocalService service=new AppiumServiceBuilder()
                .withAppiumJS(new File("C:\\Users\\SOUMALYA\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\appium.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();*/


        //Build parameters for appium server:
        /*AppiumServiceBuilder appiumServiceBuilder = new AppiumServiceBuilder();
        int appiumPort=4723;
        final String APPIUM_IP = "127.0.0.1";
        appiumServiceBuilder.usingPort(appiumPort)
                .withIPAddress(APPIUM_IP)
                .withAppiumJS(new File("C:\\Users\\SOUMALYA\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                .withLogFile(new File(System.getProperty("user.dir") + "/target/resources/appium_server_logs" + Thread.currentThread().getId()));
        AppiumDriverLocalService service= AppiumDriverLocalService.buildService(appiumServiceBuilder);
        service.start();

        UiAutomator2Options options=new UiAutomator2Options();
        options.setDeviceName("ONEPLUS A6010");
        options.setApp("./src/main/resources/ApiDemos-debug.apk");
        AndroidDriver driver=new AndroidDriver(new URL("https://127.0.0.1:4723"),options);*/
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();

    }

}
