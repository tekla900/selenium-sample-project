import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CommandsTest {

    @Test
    public void getHerokuInfo() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);


        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        WebElement enableButton = driver.findElement(By.xpath("//*[@id=\"input-example\"]/button"));
        enableButton.click();

        Thread.sleep(3000);

        WebElement inputField = driver.findElement(By.xpath("//*[@id=\"input-example\"]/input"));
        WebElement inputText = driver.findElement(By.xpath("//*[@id=\"message\"]"));


        Assert.assertTrue(inputField.isEnabled(), "Input field is not enabled.");Assert.assertEquals(inputText.getText(), "It's enabled!", "Text is not as expected.");

    }
}
