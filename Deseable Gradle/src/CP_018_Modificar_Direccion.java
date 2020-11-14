import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CP_018_Modificar_Direccion {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Documents\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\automationpractice.com");
		driver.findElement(By.className("login")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("emailpruebapruebaprueba1234@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("pruebatecnica1");
		driver.findElement(By.id("SubmitLogin")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[1]/ul/li[3]/a/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/div/div/ul/li[9]/a/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("address1")).clear();
		driver.findElement(By.id("address1")).sendKeys("Cra 2 12345");
		driver.findElement(By.id("submitAddress")).click();
		String account = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/div/div/ul/li[4]/span[1]")).getText();
		System.out.println("Info-Account : "+account);
		String resultado = "Cra 2 12345";
		if (account.equals(resultado)) {
			System.out.println("Prueba Exitosa");
		}else {
			System.out.println("Prueba Fallida");
		}
	}
	
}
