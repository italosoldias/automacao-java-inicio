package fremework.selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class TesteComandosWebdriverJava {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		comandosNav() ;
		
	}
	
public static void comandosNav() {
		
	
		driver = new ChromeDriver();
		System.setProperty("webdriver.chorme.driver", "c:/autodrivers/chromedriver.exe");
		
		
		
		driver.get("https://www.facebook.com");
		
		String titulo = driver.getTitle();
		System.out.println(titulo);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String codigo = driver.getPageSource();
		//System.out.println(codigo);
		
		driver.close();
		
	};
	
}
