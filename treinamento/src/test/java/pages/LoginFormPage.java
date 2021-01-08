package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginFormPage extends BasePage {

	public LoginFormPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "ap_email") WebElement emailBox;
	@FindBy(id = "ap_password") WebElement passBox;
	@FindBy(id = "signInSubimit") WebElement signInButton;
	
	public PaymentPage typeLogin(String email, String senha) {
		emailBox.sendKeys(email);
		passBox.sendKeys(senha);;
		return new PaymentPage(driver);
	}
}