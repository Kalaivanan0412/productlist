package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class productlist {
	WebDriver driver;
	@Given("User is on homepage")
	public void user_is_on_homepage() {
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://retailm1.upskills.in/");
		System.out.println("webdriver is initialized");
		
		driver.get("http://retailm1.upskills.in/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("Admin@123");
		driver.findElement(By.tagName("button")).click();
}
	@When("enter the username")
	public void user_enter_the_Username(){
		driver.findElement(By.name("username")).sendKeys("admin");
}
	@When("enter the password")
	public void enter_the_password(){
		driver.findElement(By.id("pass")).sendKeys("Admin@123");

	}


	@Given("user clicks on project list")
	public void user_clicks_on_Addnewproject() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a.btn.btn-primary i")).click();
		Thread.sleep(1000);
	  
	}

	@When("user enters  data in fields productName{string} and Code{string}")
	public void user_enters_data_in_fields_productName_and_Code(String productname, String code) throws InterruptedException {

	 	driver.findElement(By.xpath("//input[@name='name']")).sendKeys(productname);
	 	Thread.sleep(10000);
	 	driver.findElement(By.xpath("//input[@name='code']")).sendKeys(code);
	 	Thread.sleep(10000);
	}

	@Then("Saves the new project")
	public void saves_the_new_project() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
		Thread.sleep(2000);
	   
	}

	@When("User clicks on Edit Page")
	public void user_clicks_on_Edit_product_Page() throws InterruptedException {
		driver.findElement(By.xpath("//table/tbody/tr[5]/td[8]/a/i")).clear();
		Thread.sleep(2000);
	}

	@When("User enters the New productname{string} and productCode{string}")
	public void user_enters_the_New_product_productname_and_productmodel(String productname, String productmodel) throws InterruptedException {
	    driver.findElement(By.xpath("//input[@name='name']")).clear();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='name']")).sendKeys(productname);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='model']")).sendKeys(productmodel);
	    Thread.sleep(2000);
	}

	@Then("Saves the product")
	public void saves_the_product() { 
		driver.findElement(By.cssSelector("i.fa.fa-save")).click();
		
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
	}

	@Then("validation message appears")
	public void validation_message_appears() {
	}


	}