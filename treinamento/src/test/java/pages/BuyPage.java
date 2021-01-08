
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class BuyPage extends BasePage {
 
    public BuyPage(WebDriver driver) {
		super(driver);
	}

    @FindBy(id = "buy-now-button") WebElement buyNowButton;
    
	public LoginFormPage clicarBuyNow(){
    	buyNowButton.click();
        return new LoginFormPage(driver);
    }
 
}
