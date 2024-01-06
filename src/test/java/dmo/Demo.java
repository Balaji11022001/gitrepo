package dmo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		// maxamize the browser window
		
		driver.manage().window().maximize();


		
		
		// delete browser cookies
		
		driver.manage().deleteAllCookies();
		
		// Fetch the title of the page
		
		String title = driver.getTitle();
		
		System.out.println("The title of page-1 is : " + title);
		// Fetch the URL of the webpage
				 String url = driver.getCurrentUrl();
				
				 System.out.println("The URL of page is : " + url);
				
				 // Methods to naviagate form one webpage to another webpage
				
				driver.navigate().to("https://www.selenium.dev/downloads/") ;
				
			    String title1 = driver.getTitle();
				
				System.out.println("The title of webpage-2 is : " + title1);
					



	}

}
