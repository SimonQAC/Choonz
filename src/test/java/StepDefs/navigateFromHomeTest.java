package StepDefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class navigateFromHomeTest {
	
	private static WebDriver driver;
	
	@Before
	public void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/selenium/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1366, 768));
	}
	
	@Given("I am on the HomePage")
	public void i_am_on_the_HomePage() {
		driver.get("http://localhost:8082/index.html");
		assertEquals("Choonz", driver.getTitle());
	}

	@When("I click the Playlist tab")
	public void i_click_the_playlist_tab() {
		driver.get("http://localhost:8082/index.html");
		assertTrue(driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/class/li[2]/a")).isDisplayed());
	}

	@Then("I will land on the Playlist Page")
	public void i_will_land_on_the_Playlist_Page() {
		driver.get("http://localhost:8082/index.html");
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/class/li[2]/a")).click();
		assertEquals("Playlists", driver.getTitle());
	}
	
	@When("I click the Artist tab")
	public void i_click_the_Artist_tab() {
		driver.get("http://localhost:8082/index.html");
		assertTrue(driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/class/li[3]/a")).isDisplayed());
	}

	@Then("I will land on the Artist Page")
	public void i_will_land_on_the_Artist_Page() {
		driver.get("http://localhost:8082/index.html");
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/class/li[3]/a")).click();
		assertEquals("Artists", driver.getTitle());
	}
	
	@When("I click the Album tab")
	public void i_click_the_Album_tab() {
		driver.get("http://localhost:8082/index.html");
		assertTrue(driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/class/li[4]/a")).isDisplayed());
	}

	@Then("I will land on the Album Page")
	public void i_will_land_on_the_Album_Page() {
		driver.get("http://localhost:8082/index.html");
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/class/li[4]/a")).click();
		assertEquals("Albums", driver.getTitle());
	}
	
	@When("I click the Genre tab")
	public void i_click_the_Genre_tab() {
		driver.get("http://localhost:8082/index.html");
		assertTrue(driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/class/li[5]/a")).isDisplayed());
	}

	@Then("I will land on the Genre Page")
	public void i_will_land_on_the_Genre_Page() {
		driver.get("http://localhost:8082/index.html");
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/class/li[5]/a")).click();
		assertEquals("Genres", driver.getTitle());
	}
	
	@When("I click the Track tab")
	public void i_click_the_Track_tab() {
		driver.get("http://localhost:8082/index.html");
		assertTrue(driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/class/li[6]/a")).isDisplayed());
	}

	@Then("I will land on the Track Page")
	public void i_will_land_on_the_Track_Page() {
		driver.get("http://localhost:8082/index.html");
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/class/li[6]/a")).click();
		assertEquals("Tracks", driver.getTitle());
	}
	@After
	public void fin() {
		driver.close();
	}
}
