package basicweb;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testLogin {
	 @Test
	    public void logInTest(){
	        WebDriver driver = new ChromeDriver();
			
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("pranjalwagh3@gmail.com");
	        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("pranjal123");
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();

	        String expectedURL = "https://tutorialsninja.com/demo/index.php?route=account/account";
	        Assert.assertEquals(expectedURL,driver.getCurrentUrl());

	        driver.quit();
	    }

}
