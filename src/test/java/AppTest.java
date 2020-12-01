import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[20]/a")).click();
        driver.findElement(By.id("email")).sendKeys("cartoonx65@gmail.com");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button/i")).click();
    }
}
