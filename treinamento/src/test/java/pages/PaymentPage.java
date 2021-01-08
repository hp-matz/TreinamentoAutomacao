package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage {

	public PaymentPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(className = "a-fixed-left-grid") WebElement comboBox;
	@FindBy(name = "ppw-widgetEvent:SetPaymentPlanSelectContinueEvent") WebElement typePayment; 
	@FindBy(id = "placeYourOrder") WebElement finishButton;
	
	public void finishPurchase() {
//		selecionar forma de pagamento
		comboBox.click();
		typePayment.click();
		finishButton.click();
		
	}
}
