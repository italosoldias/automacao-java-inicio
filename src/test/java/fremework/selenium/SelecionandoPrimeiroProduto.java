package fremework.selenium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelecionandoPrimeiroProduto {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selecionandoProduto();
	}

	public static void selecionandoProduto() {
		
		driver = new ChromeDriver();
		
		System.setProperty("WebDriver.chrome.driver", "c:/autodrivers/chromedriver.exe");
		
		Actions act = new Actions(driver);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.magazineluiza.com.br");
		
		
		WebElement botaoEletro = driver.findElement(By.linkText("Eletrodomésticos"));
		
		act.doubleClick(botaoEletro).build().perform();
		
		// mapeando o webelement nav
		
		List<WebElement> categorias =  driver.findElements(By.tagName("nav"));
		
		//como criar um array de lista pegando para o elemento categoria 
		
		
		List<String> arrayCategorias = new ArrayList<String>();
		
		
		
		//laço para criar um arry de lista do objeto categoria usando o metodo add
		
		for (WebElement webElement : categorias) {
			System.out.println(arrayCategorias.add(webElement.getText()));
			
		}
		  
		System.out.println(arrayCategorias.get(2));
		
		//obs: ainda preciso ver como transformar uma posicao em outro array para conseguir validar com if
		
		if (arrayCategorias.get(0) == "Celulares" ) {
			  System.out.println("não sei o que ta retornando " + arrayCategorias.get(2) );
		} else {
			System.out.println("ta errado");
		}
			
		/*
		 * for (int i = 0 ; arrayCategorias.length ; i++ ) { if (arrayCategorias ==
		 * "Celulares" ) {
		 * 
		 * } }
		 * 
		 * if (arrayCategorias == "Celulares" ) {
		 * System.out.println("não sei o que ta retornando " + arrayCategorias.get(2) );
		 * }
		 */
		
	}
	
}
