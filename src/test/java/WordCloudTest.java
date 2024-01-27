import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
public class WordCloudTest {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\saina\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qawordcloud.ccbp.tech/");
    }
}
