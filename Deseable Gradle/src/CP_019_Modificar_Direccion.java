import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CP_019_Modificar_Direccion {

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
		driver.findElement(By.xpath(("//a[contains(@title, 'Add an address')]"))).click();
		Thread.sleep(5000);
		driver.findElement(By.id("firstname")).sendKeys("Danny");
		driver.findElement(By.id("lastname")).sendKeys("Hernandez");
		driver.findElement(By.id("company")).sendKeys("UdeA");
		driver.findElement(By.id("address1")).sendKeys("Cra 2 1234");
		driver.findElement(By.id("address2")).sendKeys("Cra 3 1234");
		driver.findElement(By.id("city")).sendKeys("Itagui");
		WebElement eleState = driver.findElement(By.name("id_state"));
		Select selectState = new Select(eleState);
		selectState.selectByValue("1");
		driver.findElement(By.id("postcode")).sendKeys("00000");
		WebElement eleCountry = driver.findElement(By.name("id_country"));
		Select selectCountry = new Select(eleCountry);
		selectCountry.selectByValue("21");
		driver.findElement(By.id("other")).sendKeys("NN");
		driver.findElement(By.id("phone")).sendKeys("0");
		driver.findElement(By.id("phone_mobile")).sendKeys("3148109382");
		driver.findElement(By.id("alias")).clear();
		driver.findElement(By.id("alias")).sendKeys("My address2");
		driver.findElement(By.id("submitAddress")).click();
		String account = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/div/div[2]/ul/li[1]/h3")).getText();
		System.out.println("Info-Account : "+account);
		String resultado = "MY ADDRESS2";
		if (account.equals(resultado)) {
			System.out.println("Prueba Exitosa");
		}else {
			System.out.println("Prueba Fallida");
		}
	}
	
}
