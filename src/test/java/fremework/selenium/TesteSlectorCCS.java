package fremework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TesteSlectorCCS {
	static WebDriver driver; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mapeandoClasse();
	}
	public static void cssSelec() {
		
		driver = new ChromeDriver();
	
		
		
		
		Actions act = new Actions(driver);
		
		
		System.setProperty("webdriver.chorme.driver", "c:/autodrivers/chromedriver.exe");
		
		
		
		//driver.get("https://the-internet.herokuapp.com");
		
		driver.get("https://magazineluiza.com");
		
		driver.manage().window().maximize();
		
		
		
		WebElement campoBusca = driver.findElement(By.id("inpHeaderSearch"));
		WebElement botaoProcurar = driver.findElement(By.id("btnHeaderSearch"));
		act.sendKeys(campoBusca, "ola ").build().perform();
		act.click(botaoProcurar).build().perform();
		
		WebElement cartao = driver.findElement(By.partialLinkText("Sabão Líquido Concentrado Ola Bebê Neutro 1"));
		act.click(cartao).build().perform();
		
		WebElement foto1 = driver.findElement(By.cssSelector("a[class='js-showcase-thumb-img']"));
		act.click(foto1).build().perform();
		
		
		
	}
	
	public static void mapeandoClasse () {
		
driver = new ChromeDriver();
	
		// para buscar com css pela classe usamos o "."
		
		
		Actions act = new Actions(driver);
		
		
		System.setProperty("webdriver.chorme.driver", "c:/autodrivers/chromedriver.exe");
		
		
		
		//driver.get("https://the-internet.herokuapp.com");
		
		driver.get("https://facebook.com");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.cssSelector("input.inputtext"));
		
		act.sendKeys(email, "css").build().perform();
	}
	
}
