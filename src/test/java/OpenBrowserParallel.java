import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class OpenBrowserParallel {
    @Test
    public void paralleltesting() throws MalformedURLException {
        DesiredCapabilities caps=DesiredCapabilities.chrome();

            RemoteWebDriver driver = new RemoteWebDriver(new URL("http://0.0.0.0:80/wd/hub"),caps);
			driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
            driver.get("http://google.com");
    }
}


