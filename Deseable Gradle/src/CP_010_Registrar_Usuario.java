import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CP_010_Registrar_Usuario {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Documents\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\automationpractice.com");
		driver.findElement(By.className("login")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("SubmitCreate")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String account = driver.findElement(By.cssSelector("#create_account_error li")).getText();
		System.out.println("Info-Account : "+account);
		String resultado = "Invalid email address.";
		if (account.equals(resultado)) {
			System.out.println("Prueba Exitosa");
		}else {
			System.out.println("Prueba Fallida");
		}
	}
	
}
