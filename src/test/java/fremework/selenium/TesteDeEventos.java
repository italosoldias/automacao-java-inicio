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
		 testeBotaoDireito();
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
	
	
	public static void testeMouse() {
		
		// setei o driver do chorme
		driver = new ChromeDriver();
		boolean textoSucesso;
		boolean textoErro;
		// caminho do driver

		System.setProperty("webDriver.chorme.driver", "c:/autodrivers/chromedriver.exe");

		Actions act = new Actions(driver);

		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com");
		
		
		
		
		WebElement elementoTexto = driver.findElement(By.linkText("Form Authentication"));
		act.click(elementoTexto).build().perform();
		WebElement elementoEmail = driver.findElement(By.cssSelector("input[name='username']"));
		WebElement elementoSenha = driver.findElement(By.id("password"));
		WebElement elementoBotao = driver.findElement(By.cssSelector("button[type='submit']"));
		
		
		
		
		act.sendKeys(elementoEmail, "tomsmith").build().perform();
		act.doubleClick(elementoEmail).build().perform();
		//act.keyDown(elementoSenha, Keys.SHIFT).build().perform();
		act.sendKeys(elementoSenha, "SuperSecretPassword!").build().perform();
		
		act.click(elementoBotao).build().perform();
		

		//textoSucesso = driver.findElement(By.cssSelector("div[class='flash success']")).isDisplayed();
		textoErro = driver.findElement(By.cssSelector("div[class='flash error']")).isDisplayed();
		 //System.out.println(textoSucesso);
		
		
		
		if (textoErro == true) {
			System.out.println("apareceu com sucesso");
		} else  
			System.out.println("tem algo de errado nisso");
		
		
	
	}
	
	
	public static void testeBotaoDireito() {
		
		// setei o driver do chorme
				driver = new ChromeDriver();
				boolean textoSucesso;
				boolean textoErro;
				// caminho do driver

				System.setProperty("webDriver.chorme.driver", "c:/autodrivers/chromedriver.exe");

				Actions act = new Actions(driver);

				driver.manage().window().maximize();
				
				driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
				
				WebElement botaoClick = driver.findElement(By.cssSelector("span.context-menu-one"));
				act.contextClick(botaoClick).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER).build().perform();
				
				
	}
}
