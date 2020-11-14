import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CP_004_Buscar_Productos {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Documents\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\automationpractice.com");
		driver.findElement(By.id("search_query_top")).sendKeys("Camison");
		driver.findElement(By.name("submit_search")).click();
		Thread.sleep(5000);
		String result = driver.findElement(By.className("heading-counter")).getText();
		System.out.println("Heading-Counter : "+result);
		String resultado = "0 results have been found.";
		if (result.equals(resultado)) {
			System.out.println("Prueba Exitosa");
		}else {
			System.out.println("Prueba Fallida");
		}
	
	}
	
}
