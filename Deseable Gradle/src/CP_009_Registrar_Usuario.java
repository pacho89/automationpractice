import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CP_009_Registrar_Usuario {

	public static void main(String[] args) throws InterruptedException {
	
		//set driver path
		System.setProperty("webdriver.chrome.driver", "E:\\Documents\\drivers\\chromedriver.exe");
		//implementación del driver
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\automationpractice.com");
		//By locator = new By.ByClassName("login");
		//WebElement element = driver.findElement(locator);
		//element.click();
		driver.findElement(By.className("login")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("email_create")).sendKeys("emailpruebapruebaprueba1234@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		//wait for next page to load
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//String pageHeading = driver.findElement(By.className("page-heading")).getText();
		//System.out.println("Page Heading: "+pageHeading);
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Danny");
		driver.findElement(By.id("customer_lastname")).sendKeys("Hernandez");
		driver.findElement(By.id("passwd")).sendKeys("pruebatecnica1");
		WebElement eleDays = driver.findElement(By.id("days"));//solo busca el elemento
		Select selectDays = new Select(eleDays);
		selectDays.selectByValue("4");
		WebElement eleMonths = driver.findElement(By.id("months"));//solo busca el elemento
		Select selectMonths = new Select(eleMonths);
		selectMonths.selectByValue("10");
		WebElement eleYears = driver.findElement(By.id("years"));//solo busca el elemento
		Select selectYears = new Select(eleYears);
		selectYears.selectByValue("1989");
		driver.findElement(By.id("firstname")).sendKeys("Danny");
		driver.findElement(By.id("lastname")).sendKeys("Hernandez");
		driver.findElement(By.id("company")).sendKeys("UdeA");
		driver.findElement(By.id("address1")).sendKeys("Cra 2 1234");
		driver.findElement(By.id("address2")).sendKeys("Cra 3 1234");
		driver.findElement(By.id("city")).sendKeys("Itagui");
		WebElement eleState = driver.findElement(By.name("id_state"));//solo busca el elemento
		Select selectState = new Select(eleState);
		selectState.selectByValue("1");
		driver.findElement(By.id("postcode")).sendKeys("00000");
		WebElement eleCountry = driver.findElement(By.name("id_country"));//solo busca el elemento
		Select selectCountry = new Select(eleCountry);
		selectCountry.selectByValue("21");
		driver.findElement(By.id("other")).sendKeys("NN");
		driver.findElement(By.id("phone")).sendKeys("0");
		driver.findElement(By.id("phone_mobile")).sendKeys("3148109382");
		driver.findElement(By.id("submitAccount")).click();
		Thread.sleep(5000);
		String account = driver.findElement(By.className("info-account")).getText();
		System.out.println("Info-Account : "+account);
		String resultado = "Welcome to your account. Here you can manage all of your personal information and orders.";
		if (account.equals(resultado)) {
			System.out.println("Prueba Exitosa");
		}else {
			System.out.println("Prueba Fallida");
		}
	}
	
}
