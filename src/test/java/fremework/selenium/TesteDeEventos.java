package fremework.selenium;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TesteDeEventos {
	 public static   WebDriver driver;
	 public static void main(String[] args) {
		 testeDeTeclado	();
	}

	
	public static void testeDeTeclado() {
		//setei o driver do chorme
		driver = new ChromeDriver();
		
		
		// caminho do driver
		
		System.setProperty("webDriver.chorme.driver", "c:/autodrivers/chromedriver.exe");
		
		
		Actions act = new Actions(driver);
		
		
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");
		// estou guardando o mapeamento dos campos senha e email
		WebElement elementoSenha = driver.findElement(By.id("pass"));	
		WebElement elementoEmail = driver.findElement(By.id("email"));
		
	
		//act.sendKeys(elementoEmail, "ta dificil").build().perform();
		
	 	// keydown keyup
		
		act.keyDown(elementoEmail , Keys.SHIFT ).build().perform();
		
		
		//act.sendKeys(Keys.ENTER).build().perform();
		act.sendKeys(elementoEmail, "olha mais um teste ai").build().perform();
		
		elementoEmail.clear();
		
		act.keyUp(elementoEmail, Keys.SHIFT).build().perform();
		act.sendKeys(elementoEmail, "ola ai ").build().perform();
		
	}
}
