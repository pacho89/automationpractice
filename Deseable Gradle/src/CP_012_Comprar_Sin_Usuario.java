import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CP_012_Comprar_Sin_Usuario {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Documents\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\automationpractice.com");
		driver.findElement(By.cssSelector("[data-id-product='1']")).click();
		Thread.sleep(5000);
		driver.get("http://automationpractice.com/index.php?controller=order");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
		String account = driver.findElement(By.cssSelector("#login_form h3")).getText();
		System.out.println("Info-Account : "+account);
		String resultado = "ALREADY REGISTERED?";
		if (account.equals(resultado)) {
			System.out.println("Prueba Exitosa");
		}else {
			System.out.println("Prueba Fallida");
		}
	}
	
}
