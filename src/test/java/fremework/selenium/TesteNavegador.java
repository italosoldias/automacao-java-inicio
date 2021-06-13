package fremework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TesteNavegador {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		navegacao();
	}
	
	public static void navegacao() {
		driver = new ChromeDriver();
		
		// Actions acimporta os metodos responsaveis por fazer as interações na tela
		Actions act = new Actions(driver);
		
		
		System.setProperty("webdriver.chorme.driver", "c:/autodrivers/chromedriver.exe");
		
		
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		// o metodo navigate().to ele troca a url para a informada
		driver.navigate().to("https:/www.google.com");
		
		
		// o metodo sendKeys ele escreve no campo q vc selecionou no metodo findElement((By.name))
		
		driver.findElement(By.name("q")).sendKeys("celular");
		
		
		// o metodo sendKeys é a interação a ser executada o Keys ele define um botão
		// o metodo build().performe() define a ação
		act.sendKeys(Keys.ENTER).build().perform();
		// By.linkText ele dis q é no link do identificador informado é o .click diz para clicar
		driver.findElement(By.linkText("Shopping")).click();
		
		driver.findElement(By.name("q")).clear();
		
		driver.findElement(By.name("q")).sendKeys("mercado");
		
		act.sendKeys(Keys.ENTER).build().perform();
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
	}

}
