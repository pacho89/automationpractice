import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CP_008_Eliminar_Producto {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Documents\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\automationpractice.com");
		driver.findElement(By.cssSelector("[data-id-product='1']")).click();
		Thread.sleep(5000);
		driver.get("http://automationpractice.com/index.php?controller=order");
		driver.findElement(By.xpath(("//i[contains(@class, 'icon-trash')]"))).click();
		Thread.sleep(5000);
		By css = By.cssSelector("#center_column p");
		WebElement element = driver.findElement(css);
		String text = element.getText();
		String resultado = "Your shopping cart is empty.";
		if (text.equals(resultado)) {
			System.out.println("Prueba Exitosa");
		}else {
			System.out.println("Prueba Fallida");
		}
	
	}
	
}
