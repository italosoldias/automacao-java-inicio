package fremework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TesteJS {
	static WebDriver driver; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testeJS();
	}
	
	
	
	public static void testeJS() {
		
		driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		// Actions acimporta os metodos responsaveis por fazer as interações na tela
		Actions act = new Actions(driver);
		
		
		System.setProperty("webdriver.chorme.driver", "c:/autodrivers/chromedriver.exe");
		
		
		
		//driver.get("https://the-internet.herokuapp.com");
		
		driver.get("https://submarino.com.br");
		
		driver.manage().window().maximize();
		
		
		//html.sendKeys(Keys.chord(Keys.CONTROL, "0"));
		
		//WebElement campoPesquisar = driver.findElement(By.id("h_search-input"));
		//WebElement botaoPesquisar = driver.findElement(By.id("h_search-btn"));
		//act.sendKeys(campoPesquisar, "livro").build().perform();
		//act.click(botaoPesquisar).build().perform();
		
		js.executeScript("document.getElementById('h_search-input').value='livros'");
		
		js.executeScript("document.getElementById('h_search-btn').click();");
		
		js.executeScript("window.scrollBy(0,1600)");
		
		
		
	}
}
