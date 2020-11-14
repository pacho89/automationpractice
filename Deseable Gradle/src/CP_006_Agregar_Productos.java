import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CP_006_Agregar_Productos {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Documents\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\automationpractice.com");
		driver.findElement(By.id("search_query_top")).sendKeys("Faded Short Sleeve T-shirts");
		driver.findElement(By.name("submit_search")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[data-id-product='1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(("//span[contains(@title, 'Continue shopping')]"))).click();
		driver.findElement(By.id("search_query_top")).clear();
		driver.findElement(By.id("search_query_top")).sendKeys("Blouse");
		driver.findElement(By.name("submit_search")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[data-id-product='2']")).click();
		By css = By.cssSelector("#layer_cart h2");
		WebElement element = driver.findElement(css);
		String text = element.getText();
		String resultado = "Product successfully added to your shopping cart";
		if (text.equals(resultado)) {
			System.out.println("Prueba Exitosa");
		}else {
			System.out.println("Prueba Fallida");
		}
	
	}
	
}
