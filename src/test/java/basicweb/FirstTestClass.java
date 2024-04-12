package basicweb;
import org.openqa.selenium.JavascriptExecutor;


import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class FirstTestClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("pranjalwagh3@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("pranjal123");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();

        String expectedURL = "https://tutorialsninja.com/demo/index.php?route=account/account";
        Assert.assertEquals(expectedURL,driver.getCurrentUrl());

        driver.quit();
		
//		driver.get("https://www.amazon.in");
//		driver.manage().window().maximize();
//		WebElement signInButton = driver.findElement(By.id("nav-link-accountList-nav-line-1")); 
//		signInButton.click();
//		assert driver.getCurrentUrl().equals("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
//		WebElement usernameField = driver.findElement(By.id("ap_email")); 
//        usernameField.sendKeys("8484002139");
//        WebElement continueButton = driver.findElement(By.id("continue"));
//        continueButton.click();
//        WebElement passwordField = driver.findElement(By.id("ap_password"));
//        passwordField.sendKeys("S@h1lwagh007");
//        WebElement loginButton = driver.findElement(By.id("signInSubmit"));
//        loginButton.click();
//        if (driver.getCurrentUrl().equals("https://www.amazon.in/?ref_=nav_ya_signin")) {
//            System.out.println("Logged in successfully.");
//        } else {
//            System.out.println("Login failed");
//        }
//        WebElement chart = driver.findElement(By.id("nav-cart-count")); 
//	    chart.click();
//        WebElement deleteItemButton = driver.findElement(By.xpath("//*[@id=\"sc-active-00c17a3d-f79d-4cf0-b97b-cea809f15560\"]/div[4]/div/div[3]/div[1]/span[2]/span"));
//        if (deleteItemButton.isDisplayed()) {
//            deleteItemButton.click();
//            System.out.println("Cart items cleared successfully.");
//        } else {
//            System.out.println("No items in the cart to clear.");
//        }
//        WebElement electronicsCategory = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
//        electronicsCategory.click();
//        WebElement headphonesSubcategory = driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li[18]/span/a"));
//        headphonesSubcategory.click();
//        WebElement headphonesHeadphone = driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li[8]/span/a"));
//        headphonesHeadphone.click();
//        WebElement headphonesOnear = driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li[5]/span/a"));
//        headphonesOnear.click();
//        WebElement firstHeadphone = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/span/div/div/div[2]/div[2]/h2/a"));
//        firstHeadphone.click();
//        WebElement addToCartButton = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
//        addToCartButton.click();
//        driver.navigate().back();
//        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
//        searchBox.sendKeys("Macbook pro");
//        searchBox.submit();
//        WebElement secondItem = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
//        secondItem.click();
//        Set<String> s = driver.getWindowHandles();
//        ArrayList ar = new ArrayList(s);
//        System.out.println(ar.get(0));
//        System.out.println(ar.get(1));
//        
//        driver.switchTo().window((String)ar.get(1));
//        driver.get("https://www.amazon.in/Apple-MacBook-14-inch-11%E2%80%91core-14%E2%80%91core/dp/B0CM5SRXP8/ref=sr_1_2_sspa?dib=eyJ2IjoiMSJ9.vHoB7sGW-8pn1dAIcQgBhTWNNjTa6jTCOd5BzzwXtkFitOq2QYBL3rjyZtmlX58oUdFbELBfVEBzzGgsIFUJ_N71s7pQRhvk2Qa9uHM0yj4ZQPHgGiTD3YCaV0BoHbcp22IP1mVI080muWofykkWjbwidaVWj28O1XCUJjmIumF_DkFTOPDDKicdp3kLOaB2eVM4410bmK_2X0J8BAP8eoOQ1SMTWbdkNgsw6CPkOd0.4D5P3qVclcwtTBBRjk9llmgwC7v9uCHc76wFzQn4EJ8&dib_tag=se&keywords=Macbook+pro&qid=1712265392&sr=8-2-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
//        WebElement addToCartButton = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
//        addToCartButton.click();
//        driver.navigate().back();
//        WebElement cartIcon = driver.findElement(By.id("nav-cart-count-container"));
//        cartIcon.click();
//        WebElement deleteButton = driver.findElement(By.xpath("//*[@id=\"sc-active-23ea3c9d-046f-4268-b841-e6be6f779fc0\"]/div[4]/div/div[3]/div[1]/span[2]/span/input"));
//        deleteButton.click();
//        WebElement quantityInput = driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]"));
//        quantityInput.click();
//        WebElement quantitySelect = driver.findElement(By.xpath("//*[@id=\"a-popover-1\"]/div/div/ul/li[2]"));
//        quantitySelect.click();
//        WebElement signOutButton = driver.findElement(By.xpath("//*[@id=\"nav-item-signout\"]/span"));
//        signOutButton.click();
//        if (driver.getCurrentUrl().equals("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0")) {
//            System.out.println("Logged out from the application and landed on the sign-in page.");
//        } else {
//            System.out.println("Logout failed or landing page URL did not match.");
//        }
	    
	    
	    
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
//		SearchBox.sendKeys("iphone");
//		Thread.sleep(4000);
//		WebElement SearchIcon = driver.findElement(By.id("nav-search-submit-button"));
//		SearchIcon.click();
//		//js.executeScript("windows.scrollBY(0,4000)");
//		Thread.sleep(4000);
//		driver.quit();

	}

}
