import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class CP_007_Agregar_productos {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Documents\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\automationpractice.com");
		driver.findElement(By.className("quick-view-mobile")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("quantity-wanted")).clear();
		driver.findElement(By.id("quantity-wanted")).sendKeys("4");
		WebElement eleState = driver.findElement(By.id("group_1"));//solo busca el elemento
		Select selectState = new Select(eleState);
		selectState.selectByValue("2");
		driver.findElement(By.id("add_to_cart")).click();
		Thread.sleep(5000);
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
