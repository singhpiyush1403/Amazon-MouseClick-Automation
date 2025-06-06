
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseClickAmazon {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	WebElement hello = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	Thread.sleep(2000);
	
	 WebElement videopurchases = driver.findElement(By.xpath("//*[@id=\"nav-al-wishlist\"]/ul/li[2]/a/span"));
	 Thread.sleep(3000);
	  
	Actions mouse = new Actions(driver);
	//mouse.contextClick(hello).perform();
	mouse.moveToElement(hello).click().build().perform();
	mouse.moveToElement(videopurchases).click().build().perform();
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.close();
	}
}
