package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "twotabsearchtextbox") WebElement searchBox;
    @FindBy(className = "nav-right") WebElement searchButton;
    

    public ShoppingPage searchProducts(String product){
//    	Digitar e pesquisar na barra de pesquisa do site
		searchBox.sendKeys(product);
		searchButton.click();
        return new ShoppingPage(driver);
    }
 
}
