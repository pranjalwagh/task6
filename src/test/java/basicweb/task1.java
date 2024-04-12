package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class task1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		WebElement loginButton = driver.findElement(By.xpath("/html/body/header/nav/ul/li[4]/span"));
        loginButton.click();
        WebElement emailInput = driver.findElement(By.id("si_popup_email"));
        emailInput.sendKeys("pranjalwagh612001@gmail.com");
        WebElement passwordInput = driver.findElement(By.id("si_popup_passwd"));
        passwordInput.sendKeys("S@h1lwagh007");
        WebElement loginSubmitButton = driver.findElement(By.xpath("//button[contains(text(), 'Login')]"));
        loginSubmitButton.click();
        WebElement MYprofile = driver.findElement(By.xpath("/html/body/header/nav/div[4]/ul/li[6]/a/span[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(MYprofile).perform();
        WebElement profileButton = driver.findElement(By.xpath("/html/body/header/nav/div[4]/ul/li[6]/ul/li[4]"));
        profileButton.click();
        WebElement editButton = driver.findElement(By.xpath("//*[@id=\"personal_details\"]"));
        editButton.click();
        WebElement professionalDetailsInput = driver.findElement(By.id("designation"));
        professionalDetailsInput.clear();
        professionalDetailsInput.sendKeys("Developer");
        WebElement personalDetailsInput = driver.findElement(By.id("fullName"));
        personalDetailsInput.clear();
        personalDetailsInput.sendKeys("Pranjal Wagh");
        WebElement saveButton = driver.findElement(By.xpath("//*[@id=\"mat-tab-content-0-0\"]/div/div/div/button"));
        saveButton.click();
        WebElement MYprofile2 = driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-profile-main/app-header/header/nav/div/div[3]/ul/li[6]/div/button"));
        Actions action2 = new Actions(driver);
        action2.moveToElement(MYprofile2).perform();
	    WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-profile-main/app-header/header/nav/div/div[3]/ul/li[6]/div/ul/li[9]"));
	    logoutButton.click();

	}

}
