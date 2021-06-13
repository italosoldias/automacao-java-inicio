package fremework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ComandosWebElements {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 webElements();
	}
	
	public static void webElements() {
		boolean apareceu; 
		boolean habilitado;
	driver = new ChromeDriver();
	
	// Actions acimporta os metodos responsaveis por fazer as interações na tela
	Actions act = new Actions(driver);
	
	
	System.setProperty("webdriver.chorme.driver", "c:/autodrivers/chromedriver.exe");
	driver.manage().window().maximize();
	
	
	driver.get("https://www.facebook.com");
	
	driver.findElement(By.id("email")).sendKeys("aleatorio");
	
	driver.findElement(By.id("email")).clear();
	
	
	apareceu = driver.findElement(By.id("email")).isDisplayed();
	
	System.out.println(apareceu);
	
	driver.findElement(By.id("email")).sendKeys("aleatorio2");
	
	
	driver.findElement(By.name("login")).submit();
	
	if(apareceu == true) {
		driver.navigate().refresh();
		System.out.println("to refazendo");
	};
	
	habilitado = driver.findElement(By.id("email")).isEnabled()	;
	System.out.println(habilitado);
	
	
	
	
	
	
	
	}
}
