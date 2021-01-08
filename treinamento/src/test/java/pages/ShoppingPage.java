package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingPage extends BasePage {

	    public ShoppingPage(WebDriver driver) {
		super(driver);
	}

	    @FindBy(xpath = "(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-4'])[2]")
	    WebElement product;
	    
		public BuyPage selectProducts(){
//	    	Abrir o 2 produto da página
			product.click();
			
	        return new BuyPage(driver);
	    }
	 
}
