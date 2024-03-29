package dmo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csslocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		// CSS locator : tagname#idAttributeValue


		driver.findElement(By.cssSelector("input#email")).sendKeys("admin");
		
		// CSS locator : tagname[nameAttribute='value']
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("admin@123");
		
		driver.navigate().to("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");
		
		Thread.sleep(1500);
		
        driver.findElement(By.linkText("Log in")).click();
        
        // Fetch the inner text of the element
        
        // #userloginForm > form > div > div.mw-htmlform-field-HTMLTextField.loginText.mw-userlogin-username.mw-ui-vform-field > label
        
      String innertext =  driver.findElement(By.cssSelector("#userloginForm > form > div > div.mw-htmlform-field-HTMLTextField.loginText.mw-userlogin-username.mw-ui-vform-field > label")).getText();
        
        System.out.println(innertext);


	}

}
