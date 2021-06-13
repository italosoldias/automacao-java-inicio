package fremework.selenium;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TesteLocaitor {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testeLink();
	}

	
	public static void testClass() {
		driver = new ChromeDriver();
		System.setProperty("webDriver.chorme.driver", "c:/autodrivers/chromedriver.exe");
		Actions act = new Actions(driver);
		driver.manage().window().maximize();

		driver.get("https://www.trivago.com.br");
		
		
		 //driver.findElement(By.className("siteheader__control")).click();
		 
		 driver.findElement(By.className("siteheader__control")).click();
		  
		
	}
	
	
	public static void testeGogle() {
		driver = new ChromeDriver();
		System.setProperty("webDriver.chorme.driver", "c:/autodrivers/chromedriver.exe");
		Actions act = new Actions(driver);
		driver.manage().window().maximize();

		driver.get("https://www.google.com");

		driver.findElement(By.name("q")).sendKeys("busca avançada");

		// act.sendKeys(Keys.DOWN);

		// act.sendKeys(Keys.ARROW_DOWN).build().perform();

		act.sendKeys(Keys.ENTER).build().perform();

		driver.findElement(By.linkText("Notícias")).click();

	}

	public static void testeTags() {

		driver = new ChromeDriver();
		System.setProperty("webDriver.chorme.driver", "c:/autodrivers/chromedriver.exe");
		Actions act = new Actions(driver);
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");

		List<WebElement> links = driver.findElements(By.tagName("label"));
		System.out.println("quantidade " + links.size());

		for (WebElement webElement : links) {

			System.out.println(webElement.getText());
		}
	}

	public static void testeLink() {

		driver = new ChromeDriver();
		System.setProperty("webDriver.chorme.driver", "c:/autodrivers/chromedriver.exe");
		Actions act = new Actions(driver);
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");
	
		
		driver.findElement(By.partialLinkText("Esqueceu a ")).click();
		
		driver.findElement(By.partialLinkText("Entrar")).click();
	}
}
