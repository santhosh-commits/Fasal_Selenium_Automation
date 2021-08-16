package automationpractice.com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.Utils;

public class Women {
private WebDriver driver;
	
	public Women(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement getDressFilter() {
		return Utils.waitToBeClickable(driver, By.id("uniform-layered_category_8"), 30);
	}

	public WebElement getSizeFilter() {
		return Utils.waitToBeClickable(driver, By.id("uniform-layered_id_attribute_group_2"), 30);
	}

	public WebElement getCompositions() {
		return Utils.waitToBeClickable(driver, By.id("layered_id_feature_5"), 30);
	}

	
}
